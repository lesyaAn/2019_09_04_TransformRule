package de.telran;

public class ToLowerCaseRule extends TransformRule {
    public boolean check (String string){

        return string.length()== 5;
    }

    public String transform(String string){

        return string.toLowerCase();
    }
}
