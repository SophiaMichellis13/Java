import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do paciente: ");
        double idade = scanner.nextDouble();


        System.out.println("Digite a quantidade de batimentos cardíacos: ");
        double minimoTransplante = scanner.nextDouble();


        if (idade <= 18 && minimoTransplante <= 90000) {
            System.out.println("Se enquadra para a lista de transplante!");
        }else if (idade <=60 && minimoTransplante <= 100000) {
            System.out.println("Se enquadra para a lista de transplante!");
        } else if (idade > 60 && minimoTransplante <= 95000){
            System.out.println("Se enquadra para a lista de transplante!");
        }else {
            System.out.println("Não está dentro dos requisitos para a fila de transplante!");
        }



        scanner.close();

    }
}
