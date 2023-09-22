import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite sua altura");
        p.setAltura(sc.nextDouble());
        System.out.print("Digite seu peso");
        p.setPeso(sc.nextDouble());
        System.out.printf( "%.2f" , p.getIMC());
    }


        }








