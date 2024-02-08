package hhjj;
public class ActionType {
    private CharacterType characterType;

    public ActionType (CharacterType characterType) {
        this.characterType = characterType;
    }

    public String attack (){
        return characterType.attack();
    }

    public String defend(){
        return characterType.defend();
    }
}
