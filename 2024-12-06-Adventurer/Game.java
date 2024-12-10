import java.util.Scanner;
import java.util.Random;
public class Game{
  public static void main(String[] args) {
    Adventurer p1 = new Adventurer1("player");
    Adventurer p2 = new CodeWarrior("enemy");
    Scanner userInput = new Scanner(System.in);
    boolean gameRunning = true;
    while(gameRunning){
    System.out.println(p1.getName() + ", " + p1.getHP() + "/" + p1.getmaxHP() + ", " + p1.getSpecial() + "/" + p1.getSpecialMax() + ", " + p1.getSpecialName());
    System.out.println(p2.getName() + ", " + p2.getHP() + "/" + p2.getmaxHP() + ", " + p2.getSpecial() + "/" + p2.getSpecialMax() + ", " + p2.getSpecialName());
    if(p1.getHP() <= 0){
      System.out.println("Slained by enemy! Play again.");
      gameRunning = false;
    }
    if(p2.getHP() <=0){
      System.out.println("You won!");
      gameRunning = false;
    }
    String action = "";
    boolean valid = false;
    while (!valid){
      System.out.println("Type in lowercase: (a)ttack / (sp)ecial / (su)pport / quit");
      action = userInput.nextLine();
      valid = action.equals("a") || action.equals("attack") ||
              action.equals("sp") || action.equals("special") ||
              action.equals("su") || action.equals("support") ||
              action.equals("quit");
      if(!valid){
        System.out.println("Invalid input. Try again.");
      }
    }
    if (action.equals("quit")){
      System.out.println("Goodbye. See you next time!");
      gameRunning = false;
    }
    else if (action.equals("a") || action.equals("attack")){
      System.out.println(p1.attack(p2));
    }
    else if (action.equals("sp") || action.equals("special")){
      System.out.println(p1.specialAttack(p2));
    }
    else if (action.equals("su") || action.equals("support")){
      System.out.println(p1.support());
    }
    if (p2.getHP > 0){
      int randomAction = random.nextInt(3);
      if (randomAction == 0){
        System.out.println(p2.attack(p1));
      }
      else if (randomAction == 1){
        System.out.println(p2.specialAttack(p1));
      }
      else {
        System.out.println(p2.support());
      }
    }
    }
    userInput.close();
  }
}
