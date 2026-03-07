import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        double num = 0;

        for (int i = 0; i < 10; i++) {
            
            while (true) {
                System.out.print("Digite o " + (i + 1) + " numero real: ");
                if(sc.hasNextDouble()){
                    num = sc.nextDouble();
                    numbers.add(num);
                    break;
                }else{
                    System.out.println("Erro, Digite apenas numeros. \n");
                    sc.next();
                    continue;
                }
            }
        }

        Collections.reverse(numbers);
        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.println("Elemento na posição " + (i + 1) + ": " + numbers.get(i));
        }

        sc.close();
    }
}
