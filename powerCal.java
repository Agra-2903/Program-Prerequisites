import java.util.*;

class Main{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number for base");
  int base = sc.nextInt();
  System.out.println("Enter number for exponent");
  int exp = sc.nextInt();
  System.out.println("Result: " + Math.pow(base, exp));
}
}