package de.telran;

public class ToUpperCaseRule extends TransformRule {

    public boolean check (String string){

        return string.length()== 5;
    }

    public String transform(String string) {

        return string.toUpperCase();
    }
}
