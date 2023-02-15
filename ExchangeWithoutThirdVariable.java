import java.util.Scanner;

public class ExchangeWithoutThirdVariable {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

   System.out.print("Enter the value of variable 1: ");
   int var1 = input.nextInt();

   System.out.print("Enter the value of variable 2: ");
   int var2 = input.nextInt();

   System.out.println("Before exchange: var1 = " + var1 + " and var2 = " + var2);

   var1 = var1 + var2;
   var2 = var1 - var2;
   var1 = var1 - var2;

   System.out.println("After exchange: var1 = " + var1 + " and var2 = " + var2);
}
}