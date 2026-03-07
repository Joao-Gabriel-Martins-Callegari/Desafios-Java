import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite uma letra: ");
            String letra  = sc.next();

            if(letra.length() > 1){
                System.out.println("Erro, digite apenas uma letra");
                return;
            }

            char c = letra.charAt(0);
            if(!Character.isLetter(c)){
                System.out.println("Erro: A entrada é invalida. Insira apenas letras do alfabeto");
                return;
            }

            letra = letra.toLowerCase();

            switch (letra) {
                case "a", "e", "i", "o", "u" -> System.out.println("Vogal");
                default -> System.out.println("Consoante");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }
    }
}
