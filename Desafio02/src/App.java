import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero de 1 a 7: ");
        int num = 0;
        boolean valorValido = false;


        while (!valorValido) {
            if(sc.hasNextInt()){
                num = sc.nextInt();
                valorValido = true;
            }else{
                System.out.println("Erro, você inseriu letras ou simbolos. Digite um numero");
                sc.next();
                System.out.println("Tente novamente (1-7): ");
            }
        }

        if(num < 1 || num > 7){
            System.out.println("Valor Invalido!");
        }else{
            switch (num){
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda-Feira"); break;
                case 3: System.out.println("Terça-Feira"); break;
                case 4: System.out.println("Quarta-Feira"); break;
                case 5: System.out.println("Quinta-Feira"); break;
                case 6: System.out.println("Sexta-Feira"); break;
                case 7: System.out.println("Sábado"); break;
            }
        }

        sc.close();

    }
}
