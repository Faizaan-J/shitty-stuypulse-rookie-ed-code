package Adventurer;

public class Healer extends Adventurer{
    @Override
    public String support(Adventurer other) {
        other.setHP(other.getmaxHP());
        return "Healed " + other.getName();
    }

    public Healer(String name) {
        super(name);
    }

    @Override
    public String support() {
        super.setHP(super.getmaxHP());
        return "Healed self";
    }

    @Override
    public String attack(Adventurer other) {
        other.applyDamage(15);
        return "Adventurer.Healer attacked";
    }
}
