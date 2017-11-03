public class Main {

    public static void main(String[] args) {

        calculatescore(true, 800, 5, 100);
        //    calculatescore(true, 1000, 8, 200);


        int highscore = calculatescore(true, 700, 3, 300);
        System.out.println("your final score was " + highscore);
 //   }

//    int highscore = calculatescore(true, 700, 3, 300);
//        System.out.println("your final score was "+highscore);

    }

    int highscoreposition = calculatehighscoreposition(1500);
    displayhighscoreposition("najeeb", highscoreposition);

    highscoreposition = calculatehighscoreposition(900);
    displayhighscoreposition()

    public static void displayhighscoreposition(String playername, int highscoreposition){
        System.out.println(playername + "managed to get into position"
        + highscoreposition + " on the high score table ");
    }

    public static int calculatehighscoreposition(int playerscore){
        if(playerscore > 1000) {
            return 1;
        }else if(playerscore > 500 && playerscore < 1000) {
            return 2;
        }else if (playerscore > 100 && playerscore < 500){
            return 3;
        }else {
            return 4;
        }
    }









    public static int calculatescore(boolean gameover, int score, int levelcompleted, int bonus) {

        if (gameover) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 1000;
            System.out.println("your final score was " + finalscore);
            return finalscore;
        }
// else {
//            return -1;
       // }
        return -1;


    }
}
