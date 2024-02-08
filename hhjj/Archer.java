package hhjj;
public class Archer implements CharacterType {
    public String attack(){
        String output = "";
        output += "Archer shoots an arrow!";

        return output;
    }
    public String defend(){
        String output = "";
        output += "Using a shield to defend!\n";
        return output;
    }
}