package Adventurer;// copied and pasted from assignment

public abstract class Adventurer{
    private String name;
    private int HP, maxHP;

    /*There is no no-arg constructor. Be careful with your subclass constructors.*/

    public Adventurer(String name){
        this(name, 10);
    }

    public Adventurer(String name, int hp){
        this.name = name;
        this.HP = hp;
        this.maxHP = hp;
    }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */

    //hurt the target adventurer
    public abstract String attack(Adventurer other);

    //heal the target adventurer
    public abstract String support(Adventurer other);

    //heal self
    public abstract String support();

    /*
      standard methods
      why do u have a fucking applyDamage method but not a applyHealth method
    */
    public void applyDamage(int amount){
        setHP(this.HP - amount);
    }

    // fuck u im adding it
    public void applyHealth(int amount) {
        setHP(this.HP + amount);
    }

    //toString method
    public String toString(){
        return this.getName();
    }

    //Get Methods
    public String getName(){
        return name;
    }

    public int getHP(){
        return HP;
    }

    public int getmaxHP(){
        return maxHP;
    }
    public void setmaxHP(int newMax){
        maxHP = newMax;
    }

    //Set Methods
    public void setHP(int health){
        if (health > maxHP) {
            System.out.println("NO");
            this.HP = maxHP;
            return;
        }
        this.HP = health;
    }

    public void setName(String s){
        this.name = s;
    }
}