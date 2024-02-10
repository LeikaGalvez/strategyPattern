package galvezStrategyPattern;

public class Wizard implements CharacterType {
    public void attack(){
        SpellAttack spell = new SpellAttack();
        spell.attack();
    }
    public void defend(){
        BarrierDefense  barrier = new BarrierDefense();
        barrier.defend();
    }
}