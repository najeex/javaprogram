public class methodoverloading {
    public static void main(String[] args) {
        int newscore = calculatescore(" najeeb ", 500);
        System.out.println("New score is " + newscore);
        calculatescore(89);

    }

    public static int calculatescore(String playername, int score) {
        System.out.println("Player " + playername + "scored" + score + "points");
        return score * 1000;
    }

    public static int calculatescore(int score) {
        System.out.println("unname Player " + "scored" + score + "points");
        return score * 1000;

    }
}