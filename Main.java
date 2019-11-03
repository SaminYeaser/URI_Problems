package URISolves;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float n1,n2,n3,n4,n5,avg,new1;
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextFloat();
        n2 = keyboard.nextFloat();
        n3 = keyboard.nextFloat();
        n4 = keyboard.nextFloat();
        float sum = (2*n1+3*n2+n3*4+n4*1);
        avg = sum/10;
        if (avg>=7.0){
            System.out.println("Media: "+avg);
            System.out.println("Aluno aprovado.");
        }
        else if (avg<5.0){
            System.out.println("Media: "+avg);
            System.out.println("Aluno reprovado.");
        }
        else if (avg>=5.0 && avg<=6.9){
            System.out.println("Media: "+avg);
            System.out.println("Aluno em exame.");
            n5 = keyboard.nextFloat();
            System.out.println("Nota do exame: "+n5);
            new1 = (avg+n5)/2;
            System.out.println("Media final: "+new1);
        }

    }
}
