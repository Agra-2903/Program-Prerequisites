import java.util.*;

class Main{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the temperature in Celsius");
  double tempInCel = sc.nextDouble();
  System.out.println("Temperature in Fahrenheit: " + ((Celsius * (9/5)) + 32));
}
}