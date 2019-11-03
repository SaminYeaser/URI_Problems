package URISolves;
import java.util.Scanner;
public class Uri1045 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        double big=0,bigger=0,biggest=Math.max(a,Math.max(b,c));
        if(biggest==a){
            bigger = Math.max(b,c);
            big = Math.min(b,c);
        }
        if (biggest==b){
            bigger = Math.max(a,c);
            big = Math.min(a,c);
        }
        if (biggest==c){
            bigger = Math.max(a,b);
            big = Math.min(a,b);
        }
        if(biggest>=bigger+big){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(biggest*biggest>bigger*bigger+big*big) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(biggest*biggest==bigger*bigger+big*big){
            System.out.println("TRIANGULO RETANGULO");
        }
        if(biggest*biggest<bigger*bigger+big*big) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(biggest==bigger && biggest==big && bigger==big){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if(((biggest == bigger) &&(biggest != big)) || ((biggest == big) &&(biggest != bigger)) || ((bigger == big) &&(bigger != biggest))){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
