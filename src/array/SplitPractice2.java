package array;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        //find the words that has an even amount of letter
        String str= "Hummingbirds split from their sister group, the swifts and treeswifts, " +
                "around 42 million years ago. The common ancestor of extant hummingbirds is " +
                "estimated to have lived 22 million years ago in South America. " +
                "They are known as hummingbirds because of the humming sound created by their" +
                " beating wings, which flap at high frequencies audible to humans. They hover " +
                "in mid-air at rapid wing-flapping rates, which vary from around 12 beats per second in the " +
                "largest species to around 80 per second in small hummingbirds. Of those species that have been " +
                "measured during flying in wind tunnels, their top speeds exceed 15 m/s (54 km/h; 34 mph). During " +
                "courtship, some male species dive from 30 metres (100 ft) of height above a female at speeds around " +
                "23 m/s (83 km/h; 51 mph).";
        //get rid of spaces, split space
        String text= "";
        for (int i=0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i))|| str.charAt(i)== ' '){
                text+= str.charAt(i);

            }
        }
        System.out.println(text);
        System.out.println();
        String[] splitText= text.split(" ");
        System.out.println(Arrays.toString(splitText));
        int counter=0;
        for(String word: splitText){
            if (word.length()%2==0){
                counter++;
                System.out.println(word);
            }
        }
        System.out.println("there are "+counter+ " even words in our string");

    }
}
