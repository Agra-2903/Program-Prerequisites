import java.util.*;

class Main{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter three numbers");
  double num1 = sc.nextDouble();
  double num2 = sc.nextDouble();
  double num3 = sc.nextDouble();
  System.out.println("Average of three numbers: " + ((num1 + num2 + num3) / 3));
}
}