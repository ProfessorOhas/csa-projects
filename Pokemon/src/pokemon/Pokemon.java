package pokemon;

public class Pokemon {

  String name;
  boolean isFishing;
  boolean isFighting;
  int hitPoints;

  public Pokemon(String setName, boolean fishingStatus, boolean fightingStatus, int health) {
    // Exercise 1
    // constructor to set default values
    this.name = setName;
    this.isFishing = fishingStatus;
    this.isFighting = fightingStatus;
    this.hitPoints = health;
  }

  public void setDamage(int amountOfDamage) {
    // Exercise 1
    // Subtracts amountOfDamage from hitPoints
    this.hitPoints = hitPoints - amountOfDamage;
  }

  public static void compareHP(Pokemon a, Pokemon b) {
    // Exercise 3
    // Compares hitpoints between 2 pokemon
    if (a.hitPoints > b.hitPoints) {
      System.out.println(a.name + " has more hitpoints");
    } else if (a.hitPoints < b.hitPoints) {
      System.out.println(b.name + " has more hitpoints");
    } else {
      System.out.println("Both pokemon have the same hitpoints!");
    }
  }

}
