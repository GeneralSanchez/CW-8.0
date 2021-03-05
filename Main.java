//Demonstrates recursion.
class Main
 {
  public static void main(String[] args)
   {
     //------------------------------------------------
     // Creates a TowersOfHanoi puzzle and solves it.
     //------------------------------------------------
    System.out.println ("Andy Sanchez, CW 8.0");
    TowersOfHanoi towers = new TowersOfHanoi (4);
    towers.solve();
  }
}