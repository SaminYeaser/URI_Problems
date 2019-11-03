package URISolves;
import java.util.Scanner;
public class Uri1042 {
    public static void main(String[] args) {
        int n,m,o;
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        m = keyboard.nextInt();
        o = keyboard.nextInt();
        if(n>m && n>o && m>o ){
            System.out.println(o);
            System.out.println(m);
            System.out.println(n);
        }
        else if(n>m && n>o && m<o ){
            System.out.println(m);
            System.out.println(o);
            System.out.println(n);
        }
        else if(m>n && m>o && n>o){
            System.out.println(o);
            System.out.println(n);
            System.out.println(m);
        }
        else if(o>n && o>m && n>m){
            System.out.println(m);
            System.out.println(n);
            System.out.println(o);
        }
        else if(o>n && o>m && n<m){
            System.out.println(n);
            System.out.println(m);
            System.out.println(o);
        }
        else if(m>n && m>o && n<o){
            System.out.println(n);
            System.out.println(o);
            System.out.println(m);
        }
        System.out.println();
        System.out.println(n);
        System.out.println(m);
        System.out.println(o);
    }
}
