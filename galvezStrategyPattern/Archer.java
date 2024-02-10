package galvezStrategyPattern;

public class Archer implements CharacterType {
    public void attack(){
       ArrowAttack arrows = new ArrowAttack();
       arrows.attack();
    }
    public void defend(){
        ShieldDefense shield = new ShieldDefense();
        shield.defend();
    }
}