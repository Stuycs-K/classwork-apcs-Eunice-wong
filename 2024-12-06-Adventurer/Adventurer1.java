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
        int healing = 5;
        this.setHP(Math.min(getHP() + 5, getmaxHP()));
        return getName() + "heals themself" + "with" + healing + "HP";
    }
    public abstract String specialAttack(Adventurer other){
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
