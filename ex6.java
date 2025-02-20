import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o valor do desconto do INSS: ");
        double descontoINSS = scanner.nextDouble();
        
        double salarioLiquido = salarioBruto - descontoINSS;
        System.out.println("O salário líquido é: " + salarioLiquido);
        
        scanner.close();
    }
}
