import java.util.Scanner;
public class uri1046 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int hour=24;
        if(a>=b){
            int value=hour-a;
            int valueEnd = value+b;
            System.out.println("O JOGO DUROU "+ valueEnd +" HORA(S)");
        }
        else{
            int valueEnd = b-a;
            System.out.println("O JOGO DUROU "+ valueEnd +" HORA(S)");
        }
    }
}
