package URISolves;
import java.util.Scanner;
public class Uri1041 {
    public static void main(String[] args) {
       double n,m;
       Scanner keyboard = new Scanner(System.in);
       n = keyboard.nextDouble();
       m = keyboard.nextDouble();
       if(n>0 && m>0){
           System.out.println("Q1");
       }
       else if(n>0 && m<0){
           System.out.println("Q4");
       }
       else if (n<0 && m>0){
           System.out.println("Q2");
       }
       else if (n<0 && m<0){
           System.out.println("Q3");
       }
       else if(n==0 && m==0){
           System.out.println("Origem");
       }
       else if (n==0){
           System.out.println("Eixo Y");
       }
       else if (m==0){
           System.out.println("Eixo X");
       }
    }
}
