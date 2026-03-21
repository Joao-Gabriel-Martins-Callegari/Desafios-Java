import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro texto: ");
        String texto1 = sc.nextLine();
        int tam01 = texto1.length();
        System.out.println("Dados do texto 1");
        System.out.println("Tamanho: "+ tam01+"\nConteudo: " + texto1);

        System.out.print("Digite o segundo texto: ");
        String texto2 = sc.nextLine();
        int tam02 = texto2.length();
        System.out.println("Dados do texto 2");
        System.out.println("Tamanho: "+tam02+"\nConteudo: "+ texto2);

        if(tam01 == tam02) System.out.println("Os textos tem o mesmo tamanho");
        else System.out.println("O tamanho dos textos são diferentes");

        texto1.toLowerCase();
        texto2.toLowerCase();

        if(texto1.equals(texto2)) System.out.println("Os textos tem o mesmo conteudo");
        else System.out.println("O conteudo dos textos são diferentes");

        sc.close();
    }
}
