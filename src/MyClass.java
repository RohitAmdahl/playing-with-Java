public class MyClass {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1200;
        int levelCompleted = 5;
        int bonus = 400;
        int finalScore = score;
        calculateScore();
    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 500;
        int levelComplete = 5;
        int bonus = 100;
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelComplete * bonus);
            System.out.println("your final score " + finalScore);
        } else {
            System.out.println("you are still Playing ");
        }

    }


}
