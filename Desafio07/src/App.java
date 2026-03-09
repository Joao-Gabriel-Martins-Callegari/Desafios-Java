import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double[] medias = new double[10];
        double num = 0;
        int contador = 0;

        for (int i = 0; i < medias.length; i++) {
            double soma = 0;
            System.out.println("Digite a nota do aluno-"+(i+1));
            for (int j = 0; j < 4; j++) {
                while (true) {
                    
                    System.out.print("Nota-"+(j+1)+": ");

                    if(sc.hasNextDouble()){
                        num = sc.nextDouble();

                        if(num >= 0 && num <= 10){
                            soma += num;
                            break;
                        }
                    }else{
                        System.out.println("Erro, caractere invalido");
                        sc.next();
                        continue;
                    }
                }
            }

            double media = soma / 4;
            medias[i] = media;

            if(media >= 7){
                contador++;
            }
        }

        System.out.println();
        System.out.println("Total de alunos com a média maior ou igual a 7: " + contador);
        sc.close();

    }
}
