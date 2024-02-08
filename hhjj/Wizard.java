package hhjj;
public class Wizard implements CharacterType {
    public String attack(){
        String output = "";
        output += "Wizard casts a spell!";

        return output;
    }
    public String defend(){
        String output = "";
        output += "Creating a magic barrier for defense!\n";
        
        return output;
    }
}