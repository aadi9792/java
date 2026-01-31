public class UnitSum {
    static int unitSum(int n) {
        if (n < 10) return n;        // base case
        return unitSum(sumDigits(n));
    }

    static int sumDigits(int n) {
        if (n == 0) return 0;        // base case
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(unitSum(n)); // output: 2
    }
}

