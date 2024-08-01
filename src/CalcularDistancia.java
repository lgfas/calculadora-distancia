public class CalcularDistancia {

    private static double toRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    public static double calculateDistance(Double latitude1, Double latitude2, Double longitude1, Double longitude2) {
        //Medida em metros
        final int EARTH_RADIUS = 6371000;

        double lat1 = toRadians(latitude1);
        double lat2 = toRadians(latitude2);
        double lon1 = toRadians(longitude1);
        double lon2 = toRadians(longitude2);

        double dLat = toRadians(lat2 - lat1);
        double dLon = toRadians(lon2 - lon1);

        //Haversine
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }
}
