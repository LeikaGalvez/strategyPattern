package galvezStrategyPattern;

public class Character {
    private CharacterType characterType;
    
    public Character (CharacterType characterType){
        this.characterType = characterType;
    }

    public void attack (){
        characterType.attack();
    }

    public void defend(){
        characterType.defend();
    }

}
