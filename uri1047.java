import java.util.Scanner;
public class uri1047{
  public static void main(String[]args){
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter hour: ");
  int a = keyboard.nextInt();
  System.out.println("Enter minutes: ");
  int b = keyboard.nextInt();
  System.out.println("Enter end hour: ");
  int c = keyboard.nextInt();
  System.out.println("Enter end minutes: ");
  int d = keyboard.nextInt();
  int startHourInMin = a*60+b;
  
  int endHourInMin = c*60+d;
  
  if(a==c && b==d){
    System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
  }
  else{
    int totalGameInMin = endHourInMin-startHourInMin ;
    int totalGameInHour = totalGameInMin/60;
    int theMin = totalGameInMin%60;
    System.out.println("O JOGO DUROU "+totalGameInHour+" HORA(S) E "+theMin+" MINUTO(S)");
  }
  }
}