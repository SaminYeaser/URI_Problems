import java.util.Scanner;
public class uri1048 {
    public static void main(String[] args) {

        int b=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        float a = keyboard.nextFloat();

        if(a<=400.00){
            b = 15;
        }else if (a>400.01 && a<=800.00){
            b = 12;
        }else if(a>800.01 && a<=1200.00){
            b = 10;
        }else if (a>1200.01 && a<=2000.00){
            b = 7;
        }else if(a>2000.00){
            b = 4;
        }

        double sum = a + (a*b)/100;
        double percent = (a*b)/100;
        System.out.printf("Novo salario: %.2f\n", sum);
        System.out.printf("Reajuste ganho: %.2f\n", percent);
        System.out.println("Em percentual: "+ b +"%");

    }
}
