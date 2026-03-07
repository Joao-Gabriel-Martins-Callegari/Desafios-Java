import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valorValido = false;

        System.out.print("Digite um numero Valido de 0 a 10: ");

        while (!valorValido) {
            if(sc.hasNextInt()){
                num = sc.nextInt();
                valorValido = true;
            }else{
                System.out.println("Erro, Valor Invalido!!");
                System.out.print("Porfavor insira uma valor Valido ( 0-10): ");
                sc.next();
            }

            if(num < 0 || num > 10){
                System.out.println("O valor precisa estar entre 0 e 10, tente novamente: ");
                valorValido = false;
            } 
        }

        System.out.printf("O valor %d é um valor valido!!".formatted(num));
        sc.close();
    }
}
