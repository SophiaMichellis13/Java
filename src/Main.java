import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

         int valor = 10;

        System.out.println("Variavel do tipo int: " + valor);

        byte idade = 4;

        System.out.println("Minha idade: " + idade);

         long alunos = 30;

        System.out.println("Alunos presentes: " + alunos);

         short pessoas = 10;

        System.out.println("Total de pessoas jogando vôlei: " + pessoas);

         float objetos = 50;

        System.out.println("Estimativa de objetos na sala:: " + objetos);

         boolean música = true;

         System.out.println("Eu gosto de música: " + música);

         String cor = "verde";
         char outraCor = 'R';

         System.out.println("Minha cor favorita é: " + cor);
         System.out.println("A segunda cor é: " + outraCor);



         //Faça um programa em JAVA para criar duas variáveis e mostrar a soma entre elas.

        int preço1 = 10;
        int preço2 = 15;
        float resultado = preço1 + preço2;

        System.out.println("A soma dos dois números é: " + resultado);

                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número:");
                int numero1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int resultado1 = numero1 + numero2;

                System.out.println("O resultado é : " + resultado1);



        // Divisão
        System.out.println("Digite o número divisor 1:");
        int divisao1 = scanner.nextInt();
        System.out.println("Digite o número divisor 2:");
        int divisao2 = scanner.nextInt();

        int rdivisao1 = divisao1 / divisao2;

        System.out.println("O resultado da divisão é : " + rdivisao1);



// Multiplicação
        System.out.println("Digite o primeiro múltiplo:");
        int multi1 = scanner.nextInt();
        System.out.println("Digite o segundo múltiplo:");
        int multi2 = scanner.nextInt();

        int rmulti1 = multi1 * multi2;

        System.out.println("O resultado da multiplicação é : " + rmulti1);

        scanner.close();



        //Criar um algoritmo em JAVA para descobrir se o número digitado é par ou ímpar.

        int valor1 = 5;

        if (valor1 % 2 == 0) {
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é ímpar!");
        }






    }
}
