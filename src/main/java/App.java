package main.java;
import java.util.Scanner;

public class App {
        //Comentário

    public static void funcao_teste (){
        // //Biblioteca para entrada de dados
        // Scanner ler = new Scanner(System.in); 

        // //variável local a
        // String v2;
        // int v1;

        // System.out.println("Comando de Saida de Dados");
        
        // System.out.printf("Informe uma palavra: ");
        // v2 = ler.next();

        // System.out.printf("Informe um número: ");
        // v1 = ler.nextInt();

        // System.out.printf(v2+" "+v1);
    }
    public static void main(String[] args) throws Exception {
        CorpoHumano c1 = new CorpoHumano(50,0.6f);

        // c1.massa = "2";
        System.out.println("Altura: " + c1.getAltura());
        System.out.println("Peso: " + c1.getPeso());

        c1.setAltura(1.68f);
        c1.setPeso(80);

        System.out.println("Altura: " + c1.getAltura());
        System.out.println("Peso: " + c1.getPeso());
        System.out.println("O IMC é: " + c1.CalcularIMC());
    }
}
