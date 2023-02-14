package heroes;


public class Mage extends Hero{

    public Mage (String name) {
        this.name = name;
        level = 1;
        heroAttributes = new HeroAttributes(1, 1, 8);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS,null);
        equipment.put(Slot.WEAPON, null);
        validWeaponTypes.add(WeaponType.STAFF);
        validWeaponTypes.add(WeaponType.WAND);

    }
    @Override
    public void levelUp() {
        heroAttributes.setStrength(heroAttributes.getStrength()+1);
        heroAttributes.setDexterity(heroAttributes.getDexterity()+1);
        heroAttributes.setIntelligence(heroAttributes.getIntelligence()+5);
        level+=1;
    }
}
