package hu.nive.ujratervezes.oopcollection.army;



public class HeavyCavalry extends MilitaryUnit {

    boolean isFirstHit = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        if (isFirstHit) {
            this.isFirstHit = false;
            return this.attackPoints * 3;
        } else {
            return this.attackPoints;
        }
    }

    @Override
    public int getHitPoints() {
        if (isFirstHit) {
            this.isFirstHit = false;
            return this.attackPoints * 3;
        } else {
            return this.attackPoints;
        }
    }

}