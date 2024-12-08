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
            
}
