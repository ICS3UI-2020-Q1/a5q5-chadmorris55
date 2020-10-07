import java.util.Scanner;
/**
 * fins the factorial of a number
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //asks user for number and records it 
    System.out.println("Please enter an integer to calculate the factorial of");
    int goal = input.nextInt();
    int total = 1;
    for (int count = 1; count <= goal; count++){
      total = total * count;
      }
    System.out.println(goal + "! = " + total);
  }
}
