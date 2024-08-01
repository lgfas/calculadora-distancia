import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a latitude 1:");
        double latitude1 = scanner.nextDouble();
        System.out.println("Digite a latitude 2:");
        double latitude2 = scanner.nextDouble();
        System.out.println("Digite a longitude 1:");
        double longitude1 = scanner.nextDouble();
        System.out.println("Digite a longitude 2:");
        double longitude2 = scanner.nextDouble();

        double distancia = CalcularDistancia.calculateDistance(latitude1, latitude2, longitude1, longitude2);

        System.out.println("Distancia entre os dois pontos: " + distancia);
    }
}