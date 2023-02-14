package heroes;

import java.util.AbstractMap;

public class Ranger extends Hero{
    public Ranger (String name) {
        this.name = name;
        level = 1;
        heroAttributes = new HeroAttributes(1, 7, 1);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS,null);
        equipment.put(Slot.WEAPON, null);
        validWeaponTypes.add(WeaponType.BOW);

    }

    @Override
    public void levelUp() {
        heroAttributes.setStrength(heroAttributes.getStrength()+1);
        heroAttributes.setDexterity(heroAttributes.getDexterity()+5);
        heroAttributes.setIntelligence(heroAttributes.getIntelligence()+1);
        level+=1;
    }
}
