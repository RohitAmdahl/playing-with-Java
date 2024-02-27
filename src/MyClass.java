public class MyClass {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;
        calculateScore(gameOver,score,levelCompleted,bonus);

         score = 10000;
         levelCompleted = 8;
         bonus = 200;
        calculateScore(gameOver, score, levelCompleted,bonus );

        score = 10;
        levelCompleted = 2;
        bonus = 2;
        calculateScore(gameOver, score, levelCompleted,bonus );
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
