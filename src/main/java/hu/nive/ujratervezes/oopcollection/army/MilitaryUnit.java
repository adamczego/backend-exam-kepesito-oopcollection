package hu.nive.ujratervezes.oopcollection.army;



public abstract class MilitaryUnit {

    int healthPoints;
    int attackPoints;
    boolean hasArmor;


    public MilitaryUnit(int healthPoints, int attackPoints, boolean hasArmor) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.hasArmor = hasArmor;
    }

    public int doDamage() {
        return this.attackPoints;
    }

    public void sufferDamage(int damage) {

        if (this.hasArmor) {
            this.healthPoints = this.healthPoints - (damage / 2);
            return;
        }

        this.healthPoints -= damage;

    }

    public int getHealth() {
        return healthPoints;
    }

    public int getHitPoints() {
        return attackPoints;
    }

}