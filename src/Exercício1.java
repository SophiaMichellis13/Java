import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa
        //em dias. Leve em consideração o ano com 365 dias e o mês 30.

        //Exemplo:
        //Digite a idade: 24

        //Imprimir:
        //24 anos
        //288 meses
        //8.760 dias

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int idade = scanner.nextInt();

        int idadeMeses = 12;
        int idadeDias = 365;

        int meses = idade * idadeMeses;
        System.out.println("Sua idade em meses é: " + meses);

        int dias = idade * idadeDias;
        System.out.println("Sua idade em dias é: " + dias);


        //Desenvolva um algoritmo em JAVA que leia um número inteiro e imprima o seu antecessor e seu sucessor.

        int numero = 10;

        int antecessor = numero - 1;
        System.out.println("O antecessor é: " + antecessor);

        int sucessor = numero + 1;
        System.out.println("O sucessor é: " + sucessor);



        //Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
        //A média dos números 4, 5 e 6.
        //A soma das duas médias. A média das médias.

        float numero1 = 8;
        float numero2 = 9;
        float numero3 = 7;

        float media1 = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média aritmética é: " + media1);

        float numero4 = 4;
        float numero5 = 5;
        float numero6 = 6;

        float media2 = (numero4 + numero5 + numero6) / 3;
        System.out.println("A média é: " + media2);


        float somaMedia = media1 + media2;
        System.out.println("A soma das médias é: " + somaMedia);

        float mediaMedia = somaMedia / 2;
        System.out.println("A média das médias é: " + mediaMedia);





        scanner.close();
    }
}
