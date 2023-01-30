import java.util.Scanner;
public class Temp{
  public static void main(String[] args){
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a temperature value: ");
    int temp = userinput.nextInt();

    if (temp > 27){
      System.out.println("Hot");
    } else {
      System.out.println("Cold");
    }
  }
}
