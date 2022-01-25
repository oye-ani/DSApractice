public class diceSum {
    public static void main(String[] args) {
        printDice("", 4);
    }

    static void printDice(String p, int sum) {
        if (sum == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= sum; i++) {
            printDice(p+i, sum - i);
        }
    }
}
