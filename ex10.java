import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os dois pontos é: " + distancia);
        
        scanner.close();
    }
}
