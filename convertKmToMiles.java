import java.util.*;

class Main{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter distance in kilometers");
  double dist = sc.nextDouble();
  System.out.println("Distance in Miles: " + (dist * 0.621371));
}
}