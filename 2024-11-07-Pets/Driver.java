//Instead of just printing out the original speak() method, it adds on the string "The Mighty" in front of it to create the string "The mighty NAME"
public class Driver {
  public static void main(String[] args){
    Animal Animal1 = new Animal("arg", 15, "Sa");
    Animal1.speak();
    Bird Bird1 = new Bird("arg", 15, "Sa", 12.3, "red");
    Bird1.speak();
  }
}
class Animal {
  private String noise;
  private int age;
  private String name;

  public Animal(String noise, int age, String name){
    this.noise = noise;
    this.age = age;
    this.name = name;
  }
  public void speak(){
    System.out.println("My name is " + getName());
    System.out.println("I am " + getAge() + " years old" );
    System.out.println("I say " + getNoise());
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getNoise(){
    return noise;
  }
}
class Bird extends Animal {
    private double height;
    private String color;

public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }
  public void speak(){
    super.speak();
    System.out.println("My feathers are colored "+ color);
    System.out.println("I am " + height + " inches tall");
  }
  public String getName(){
    return "The Mighty " + super.getName();
    }
    
  //Step 8:In Driver.java answer: What is the difference before and after you override this method?
  //What does this tell us about methods that are overridden?
  //public String getName(){  }

  //Go back and complete steps 9 onwards.
}


