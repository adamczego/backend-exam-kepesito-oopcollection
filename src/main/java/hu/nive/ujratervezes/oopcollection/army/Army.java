package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        this.army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        this.army.forEach(militaryUnit -> militaryUnit.sufferDamage(damage));
        this.army.removeIf(militaryUnit -> militaryUnit.getHealth() < 1);
    }

    public int getArmyDamage() {
        return this.army.stream().reduce(0, (left, right) -> left + right.doDamage(), Integer::sum);
    }


    public int getArmySize() {
        return this.army.size();
    }
}
