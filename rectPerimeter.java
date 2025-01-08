import java.util.*;

class Main{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter length of the rectangle");
  double len = sc.nextDouble();
  System.out.println("Enter width of the rectangle");
  double wid = sc.nextDouble();
  System.out.println("Perimeter of the rectangle: " + (2 * (len + wid)));
}
}