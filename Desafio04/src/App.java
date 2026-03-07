import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        int num = 0;

        while (num >= 0) {
            System.out.print("Insira um numero positivos (Negativo para encerrar): ");
            if(sc.hasNextInt()){
                num = sc.nextInt();
                if(num < 0) break;
            }else{
                System.out.print("Erro, Digite apenas numeros porfavor\n");
                sc.next();
            }

            if(num >= 0 && num <= 25){
                contador1++;
            }else if(num >= 26 && num <= 50){
                contador2++;
            }else if(num >= 51 && num <= 75){
                contador3++;
            }else if(num >= 76 && num <= 100){
                contador4++;
            }else{
                System.out.println("O numero " + num + " está fora do intervalo considerado (0-100) - Ignorado.");
            }
        }

        System.out.println();
        System.out.println("Total de numeros entre [0-25]: " + contador1);
        System.out.println("Total de numeros entre [26-50]: " + contador2);
        System.out.println("Total de numeros entre [51-75]: " + contador3);
        System.out.println("Total de numeros entre [76-100]: " + contador4);
        sc.close();
    }
}
