package hhjj;

public class GameApp{
    public static void main(String[] args) {
        ActionType knight = new ActionType (new Knight());
        System.out.println(knight.attack());
        System.out.println(knight.defend());

        ActionType archer = new ActionType (new Archer());
        System.out.println(archer.attack());
        System.out.println(archer.defend());

        ActionType wizard = new ActionType (new Wizard());
        System.out.println(wizard.attack());
        System.out.println(wizard.defend());



    }
}