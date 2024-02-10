package galvezStrategyPattern;

public class Knight implements CharacterType {
    public void attack(){
        SwordAttack swordAttack = new SwordAttack();
        swordAttack.attack();
    }
    public void defend(){
        ShieldDefense shield = new ShieldDefense();
        BarrierDefense barrier = new BarrierDefense();
        DodgeDefense dodge = new DodgeDefense();

        shield.defend();
        dodge.defend();
        barrier.defend();

    }
}