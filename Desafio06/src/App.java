import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Desafio 6
        int mainVetor[] = new int[20];
        List<Integer> parNumbers = new ArrayList<>();
        List<Integer> imparNumbers = new ArrayList<>();
        int num = 0;

        System.out.println("Digite 20 numeros inteiros");
        for (int i = 0; i < mainVetor.length; i++) {
            
            while (true) {
                System.out.print("Digite o numero de posição " + (i + 1) + ": ");
                if(sc.hasNextInt()){
                    num = sc.nextInt();
                    if(num % 2 == 0){
                        parNumbers.add(num);
                    }else{
                        imparNumbers.add(num);
                    }
                    break;
                }else{
                    System.out.println("Erro, Digite apenas numeros inteiros");
                    continue;
                }
            }
            mainVetor[i] = num;
        }
        System.out.println();

        System.out.println("Vetor Principal = " + Arrays.toString(mainVetor));
        System.out.println("Vetor PAR = " + parNumbers);
        System.out.println("Vetor IMPAR = " + imparNumbers);
        
        sc.close();
    }
}
