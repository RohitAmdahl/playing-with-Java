public class MyClass {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 1200;
//        int levelCompleted = 5;
//        int bonus = 400;
//        int finalScore = score;
        calculateScore(true,500, 5, 100 );
    }

    public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelComplete * bonus);
            System.out.println("your final score " + finalScore);
        } else {
            System.out.println("you are still Playing ");
        }

    }


}
