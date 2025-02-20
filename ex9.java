import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em reais: ");
        double reais = scanner.nextDouble();
        
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        
        double dolares = reais / cotacaoDolar;
        System.out.println("O valor equivalente em dólares é: " + dolares);
        
        scanner.close();
    }
}
