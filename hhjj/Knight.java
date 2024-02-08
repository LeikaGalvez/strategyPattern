package hhjj;
public class Knight implements CharacterType {
    public String attack(){
        String output = "";
        output += "Knight attacks with a sword!";

        return output;
    }
    public String defend(){
        String output = "";
        output += "Using a shield to defend!\n";
        output += "Dodgin to avoid attack!\n";
        output += "Creating a magic barrier for defense!\n";
        return output;
    }
}