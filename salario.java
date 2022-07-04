import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
    final float SALARIO =200;
    System.out.println("digite las horas semanales trabajadas");
    Scanner se = new Scanner(System.in);
    float sema = se.nextFloat();
    System.out.println("el salario a pagar es de ..:"+(sema*SALARIO));


    }
    
}
