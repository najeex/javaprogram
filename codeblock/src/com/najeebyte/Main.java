package com.najeebyte;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameover = true;
        int score = 4000;
        int levelcompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000){
//            System.out.println("your score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("your score was less than 1000");
//        } else {
//            System.out.println("got hare");
//        }


        if (gameover == true) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("your final score was " + finalscore);
        }


        boolean newgameover = true;
        int newscore = 10000;
        int newlevelcompleted = 8;
        int newbonus = 200;


        if (newgameover) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("your final score was " + finalscore);
        }
    }
}
