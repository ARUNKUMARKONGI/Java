 class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("akash", 500));
        System.out.println("New score is " + calculateScore(10));
        System.out.println(calculateScore());
    }

    public static int calculateScore(String str, int score) {
        System.out.println("Player " + str + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
