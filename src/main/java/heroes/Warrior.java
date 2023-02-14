package heroes;

import java.util.AbstractMap;

public class Warrior extends Hero{
    public Warrior (String name) {
        this.name = name;
        level = 1;
        heroAttributes = new HeroAttributes(5, 2, 1);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS,null);
        equipment.put(Slot.WEAPON, null);
        validWeaponTypes.add(WeaponType.AXE);
        validWeaponTypes.add(WeaponType.HAMMER);
        validWeaponTypes.add(WeaponType.SWORD);

    }

    @Override
    public void levelUp() {
        heroAttributes.setStrength(heroAttributes.getStrength()+3);
        heroAttributes.setDexterity(heroAttributes.getDexterity()+2);
        heroAttributes.setIntelligence(heroAttributes.getIntelligence()+1);
        level+=1;
    }
}
