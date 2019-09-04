package de.telran;

public class TransformRule implements Checkable, Transformable {

    public boolean check (String string){

      return string.length()== 3;
    }

    public String transform(String string){

        return string.toUpperCase();
    }


}
