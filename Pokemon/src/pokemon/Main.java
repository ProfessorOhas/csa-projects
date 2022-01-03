package pokemon;

public class Main {

  public static void main(String[] args) {
    // Exercise 2
    // Creates 2 objects
    Pokemon charmander = new Pokemon("charmander", false, false, 39); // Created charmander object and passes parameters
                                                                      // for initial values
    Pokemon raichu = new Pokemon("raichu", false, false, 60); // Created raichu object and passes parameters for initial
                                                              // values
    // uses Pokemon.compareHP to see if the method works
    Pokemon.compareHP(charmander, raichu);
  }

}
