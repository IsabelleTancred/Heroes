package heroes;

public class HeroAttributes {
    private int strength;
    private int dexterity;
    private int intelligence;



    public HeroAttributes(int strength, int dexterity, int intelligence){
        this.strength=strength;
        this.dexterity=dexterity;
        this.intelligence=intelligence;
    }

    public int getStrength (){
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity (){
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence (){
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void add (HeroAttributes ha2){
        this.setStrength(this.getStrength()+ha2.getStrength());
        this.setDexterity(this.getDexterity()+ha2.getDexterity());
        this.setIntelligence(this.getIntelligence()+ ha2.getIntelligence());
    }
}
