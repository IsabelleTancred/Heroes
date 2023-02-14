package heroes;

import java.util.AbstractMap;

public class Rogue extends Hero{
    public Rogue (String name) {
        this.name = name;
        level = 1;
        heroAttributes = new HeroAttributes(2, 6, 1);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS,null);
        equipment.put(Slot.WEAPON, null);
        validWeaponTypes.add(WeaponType.DAGGER);
        validWeaponTypes.add(WeaponType.SWORD);
    }

    @Override
    public void levelUp() {
        heroAttributes.setStrength(heroAttributes.getStrength()+1);
        heroAttributes.setDexterity(heroAttributes.getDexterity()+4);
        heroAttributes.setIntelligence(heroAttributes.getIntelligence()+1);
        level+=1;
    }
}
