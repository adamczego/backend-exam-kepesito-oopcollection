package hu.nive.ujratervezes.oopcollection.army;



public class Swordsman extends MilitaryUnit {

    boolean hasShield = true;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (this.hasShield) {
            this.hasShield = false;
            return;
        }

        super.sufferDamage(damage);
    }

}