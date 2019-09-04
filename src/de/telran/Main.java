package de.telran;

public class Main {

    //создать 2 интерфейсаб каждый метод на 1 интерфейс, реализовать новые методы и изменить текущие



    public static void main(String[] args) {
        String input = "Big BROWN fox";
        TransformRule rule = new ToLowerCaseRule();
        String output = transform(input, rule);


        String expected = "Big brown fox";

        System.out.println(expected.equals(output)); //true

    }


    public static String transform(String sentence, TransformRule rule){
        String[] words = sentence.split(" ");


        for( int i = 0; i < words.length; i++ ){
            if(rule.check(words[i])){
                words[i] = rule.transform(words[i]);
            }
        }

       return String.join(" ", words);
    }
}
