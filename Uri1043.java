package URISolves;
import java.util.Scanner;
public class Uri1043 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextFloat();
        b = keyboard.nextFloat();
        c = keyboard.nextFloat();
        if(a+b>c && a+c>b && b+c>a ){
            System.out.printf("Perimetro = %.1f\n",a+b+c);
        }
        else {
            System.out.printf("Area = %.1f\n",(a+b)/2*c);
        }
    }
}
