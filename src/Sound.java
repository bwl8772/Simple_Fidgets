/* this is the try-this number 2.1

Compute the distance of a lightning strike
whose sound takes 7.2 seconds to reach you
 */

public class Sound {
  public static void main(String[] args) {
    double dist;
    dist = 7.2 * 1100;  // 1100 feet per second - the distance and speed at which sound travels

    System.out.println("The lightning is " + dist + " feet away.");
    System.out.println("Or, " + dist/5280 + " miles away.");


  }
}
