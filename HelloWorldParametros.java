public class HelloWorldParametros {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Hello World ");
            for (String parametro : args) {
                System.out.print(parametro + " ");
            }
        } else {
            System.out.println("Hello World [nenhum parâmetro informado]");
        }
    }
}
