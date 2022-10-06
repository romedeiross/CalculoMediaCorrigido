import java.util.Scanner;
public class CalculoMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome = teclado.next();

        System.out.println("Informe a primeira nota de: " + nome);
        float nota = teclado.nextInt();

        System.out.println("Informe a segunda nota: ");
        float nota2 = teclado.nextInt();

        System.out.println("Informe a terceira nota: ");
        float nota3 = teclado.nextInt();

        float resultado = (nota + nota2 + nota3) / 3;
        if (resultado < 6) {
            System.out.println(nome + " Está REPROVADO");
        } else if (resultado == 6) {
            System.out.println(nome + " Está EM RECUPERAÇÃO");
        } else {
            System.out.println(nome + " Está APROVADO");
        }
    }
}
