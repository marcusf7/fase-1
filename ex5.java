import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();
        
        int dias = anos * 365;
        System.out.println("Você viveu aproximadamente " + dias + " dias.");
        
        scanner.close();
    }
}
