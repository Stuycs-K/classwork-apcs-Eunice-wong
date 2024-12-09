import java.util.Scanner;
public class Game extends Adventurer{
  public static void main(String[] args) {
    Adventurer p1 = new Adventurer1();
    Adventurer p2 = new CodeWarrior();
    Scanner userInput = new Scanner(System.in);
    try{
    System.out.println("Enter Adventurer username");
    Adventurer1.setname(userInputnextLine());
    System.out.println("Enter CodeWarrior username");
    CodeWarrior.setname(userInputnextLine());
}
