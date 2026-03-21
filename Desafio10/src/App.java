import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int max = 50;
        double peso = 0;

        while (true) {
            System.out.print("Insira o peso total de peixes pescados em quilos: ");
            if (sc.hasNextDouble()) {
                peso = sc.nextDouble();
                break;
            }else{
                System.out.println("Erro, valor invalido, tente novamente");
                sc.next();
            }
        }

        System.out.print("Peso total: "+peso+"Kg\n");

        if(peso > max){
            double multa = 0;
            double excesso = 0;
            excesso = (peso - max);
            multa = excesso * 8;
            System.out.printf("Excesso: %.2f Kg\n", excesso);
            System.out.printf("Valor da multa a ser pago: R$ %.2f\n", multa);
        }else{
            System.out.println("Não houve excesso de peso. Nenhuma multa sera aplicada");
        }

        sc.close();
    }
}
