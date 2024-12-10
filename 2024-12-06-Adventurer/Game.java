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
    boolean invalid = false;
    while (!invalid){
      
    }
}
