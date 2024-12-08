public class Adventurer1 extends Adventurer{
    private int fireDamage;
    private int fireDamageMax;

    Adventurer p1 = new Adventurer1("Fire", 10, 30);
    
    public Adventurer1(String name){
        this(name, 20, 100);
    }
    public Adventurer1(String name, int hp, int fireDamageMax){
        super(name, hp);
        this.fireDamageMax = fireDamageMax;
        this.fireDamage = 0;
    }
    public String getSpecialName(){
        return "Fire";
    }
    public int getSpecial(){
        return fireDamage;
    }
    public void setSpecial(int n){
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
    public int getSpecialMax(){
        return fireDamageMax;
    }


    public String attack(Adventurer other){
        int damage = 10;
        other.applyDamage(damage);
        return getName() + "strikes" + other.getName() + "with" + damage + "damage";
    }
    
    public String support(Adventurer other){
        int healing = 5;
        other.setHP(Math.min(other.getHP() + 5, other.getmaxHP()));
        return getName() + "heals" + other.getName() + "with" + healing + "HP";
    }
    public String support(){
        int healing = 5;
        this.setHP(Math.min(getHP() + 5, getmaxHP()));
        return getName() + "heals themself" + "with" + healing + "HP";
    }
    public String specialAttack(Adventurer other){
        int cost = 20;
        if (this.fireDamage < 20){
            return getName() + "failed to unleash a special attack";
        }
        int specialAttackDamage = 25;
        other.applyDamage(specialAttackDamage);
        this.fireDamage = fireDamage - cost;
        return getName() + "knocked" + other.getName() + "off their feet!";
    }
}
