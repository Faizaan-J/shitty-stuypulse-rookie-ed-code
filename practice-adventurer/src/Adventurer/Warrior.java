package Adventurer;

public class Warrior extends Adventurer {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attack(Adventurer other) {
        other.applyDamage(67);
        return ("Attacked " + other.getName());
    }

    @Override
    public String support(Adventurer other) {
        other.applyHealth(67);
        return "Supported " + other.getName();
    }

    @Override
    public String support() {
        super.applyHealth(23);
        return "Supported self";
    }
}
