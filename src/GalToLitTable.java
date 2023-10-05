public class GalToLitTable {

  public static void main(String[] args) {
    double gallons;
    double liters;
    int counter;

    counter = 0; //this is for a line counter

    for (gallons = 1; gallons <= 100; gallons ++){
      liters = gallons * 3.7854; // convert to liters
      System.out.println(gallons + " gallons is " + liters + " liters.");

      counter ++;
      //every 10th line, add a space
      if (counter == 10) {
        System.out.println();
        counter = 0; //reset line counter
      }
    }
  }
}
