import java.util.Scanner;

public class HelloWorldInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Hello World " + nome);
        scanner.close();
    }
}
