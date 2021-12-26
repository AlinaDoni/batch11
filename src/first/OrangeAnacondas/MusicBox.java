//package first.OrangeAnacondas;
//
//import java.util.Scanner;
//
//public class MusicBox {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Scanner forEverythingElse = new Scanner(System.in);
//        System.out.println("Available music types are Classical, Pop and Rock." +
//                "Please enter the music type:");
//        String mType = input.nextLine().toLowerCase();
//
//        if (mType.equalsIgnoreCase("classical")) {
//            System.out.println("Four seasons, Fur Elise, Finlandia, Vocalise, is available songs " +
//                    "under classical music. Which one do you want to listen?");
//            String song = input.nextLine();
//
//            if (song.equalsIgnoreCase("Four seasons") || song.equalsIgnoreCase("Fur Elise") ||
//                    song.equalsIgnoreCase("Finlandia") || song.equalsIgnoreCase("Vocalise")) {
//                //ask for price song
//                System.out.println("Please enter 2$ for this song");
//                int amount= forEverythingElse.nextInt();
//                //if the amount is corect we play the song
//                if (amount == 2){
//                    System.out.println(song+ " is playing. Enjoy the song!");
//                } else if (amount > 2){
//                    int change= amount - 2;
//                    System.out.println("you have entered " + change + "$  more, please wait for the change");
//                    System.out.println(song+ " is playing.Enjoy the song!");
//                }
//                else {
//                    boolean b = amount < 2;
//                    while (amount < 2){
//                       System.out.println(amount + " is not sufficient, please enter more");
//                       int adding= input.nextInt();
//                       amount+=adding;
//                   }
//                    System.out.println(song+ " is playing. Enjoy the song");
//                }
//            } else {
//                System.out.println(song + " is not available song");
//            }
//        } else if (mType.equalsIgnoreCase("pop")) {
//            System.out.println("Beautiful, Everybody, Bad Romance, Don't Speak, Criminal, is available songs under pop music." +
//                    "Which one do you want to listen?");
//            String songpop = input.nextLine().toLowerCase();
//            if (songpop.equals("beautiful") || songpop.equals("everybody") || songpop.equals("bad romance") || songpop.equals("don't speak")
//                    || songpop.equals("criminal")) {
//                System.out.println("Please enter 4$ for this song");
//                int amount1= forEverythingElse.nextInt();
//                if (amount1 == 4){
//                    System.out.println(songpop+ " is playing. Enjoy the song!");
//                } else if (amount1 > 4){
//                    int change= amount1 - 4;
//                    System.out.println("you have entered " + change + "$  more, please wait for the change");
//                    System.out.println(songpop+ " is playing.Enjoy the song!");
//                }
//                else  {
//                    boolean d = amount1 < 4;
//                while (amount1 < 4){
//                    System.out.println(amount1 + " is not sufficient, please enter more");
//                    int adding1= input.nextInt();
//                    amount1+=adding1;
//                }
//                System.out.println(songpop+ " is playing. Enjoy the song");
//                }
//            } else {
//                System.out.println(songpop + " is not available song");
//            }
//        }
//        else if (mType.equalsIgnoreCase("Rock")) {
//            System.out.println("Highway to hell, My Life, Dream on,Don't stop Believing, Born in the USA, is available songs under rock music." +
//                    "Which one do you want to listen?");
//            String songRock = input.nextLine().toLowerCase();
//            if (songRock.equalsIgnoreCase("highway to hell") || songRock.equalsIgnoreCase("my Life") || songRock.equalsIgnoreCase("dream on") ||
//                    songRock.equalsIgnoreCase("don't stop believing") || songRock.equalsIgnoreCase("born in the usa")) {
//                System.out.println("Please enter 3$ for this song");
//                int amount2= forEverythingElse.nextInt();
//                if (amount2 == 3){
//                    System.out.println(songRock+ " is playing. Enjoy the song!");
//                } else (amount2) {
//                    boolean c = amount2 > 3;
//                    {
//                    int change= amount2 - 3;
//                    System.out.println("you have entered " + change + "$  more, please wait for the change");
//                    System.out.println(songRock+ " is playing.Enjoy the song!");
//                } else if ( amount2 < 3){
//                        while (amount2 < 4){
//                            System.out.println(amount2 + " is not sufficient, please enter more");
//                            int adding2= input.nextInt();
//                            amount2+=adding2;
//                        }
//                        System.out.println(songRock+ " is playing. Enjoy the song");
//                    }
//            } else {
//                System.out.println(songRock + " is not available song");
//            }
//        } else{
//            System.out.println(mType + " is not an available music type");
//        }
//
//
//
//
//    }
//        }

