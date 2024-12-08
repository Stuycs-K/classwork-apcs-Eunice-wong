public class Adventurer1 extends Adventurer{
    private int fireDamage;
    private int fireDamageMax;
    
    public Warrior(String name){
        this(name, 20, 100);
    }
    public Warrior(String name, int hp, int fireDamageMax){
        super(name, hp);
        this.fireDamageMax = fireDamageMax;
        this.fireDamage = 0;
    }
    public abstract String getSpecialName(){
        return "Fire";
    }
    public abstract int getSpecial(){
        return fireDamage;
    }
    public abstract void setSpecial(int n){
        if (n < 0){
            fireDamage = 0;
        }
        else if (n > fireDamageMax){
            fireDamage = fireDamageMax;
        }
        else {
        fireDamage = n;
        }
    }
    public abstract int getSpecialMax(){
        return fireDamageMax;
    }


    public abstract String attack(Adventurer other){
        int damage = 10;
        other.applyDamage(damage);
        return getName() + "strikes" + other.getName() + "with" + damage + "damage";
    }
    
    public abstract String support(Adventurer other){
        int healing = 5;
        other.setHP(Math.min(other.getHP() + 5, other.getmaxHP()));
        return getName() + "heals" + other.getName() + "with" + healing + "HP";
    }
    public abstract String support(){
        
    }

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);
}
