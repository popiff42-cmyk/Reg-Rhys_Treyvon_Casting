public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA CASTING: converting a value from one type to another");

        // 1. Widening: a smaller-range type becomes a larger-range type automatically.
        System.out.println("\n1) WIDENING CASTING (automatic)");
        int score = 87;
        double preciseScore = score;
        System.out.println("int score = " + score);
        System.out.println("double preciseScore = score; // " + preciseScore);
        System.out.println("The int fits in a double, so Java converts it for us.");

        // 2. Narrowing: converting to a smaller-range type requires an explicit cast.
        System.out.println("\n2) NARROWING CASTING (explicit)");
        double price = 19.99;
        int wholePrice = (int) price;
        System.out.println("double price = " + price);
        System.out.println("int wholePrice = (int) price; // " + wholePrice);
        System.out.println("The decimal part is discarded; this does not round.");

        // 3. Narrowing can also overflow when the value is outside the target type's range.
        System.out.println("\n3) WATCH OUT FOR OVERFLOW");
        int largeNumber = 130;
        byte smallNumber = (byte) largeNumber;
        System.out.println("int largeNumber = " + largeNumber);
        System.out.println("byte smallNumber = (byte) largeNumber; // " + smallNumber);
        System.out.println("A byte cannot hold 130, so the result wraps to a different value.");

        System.out.println("\nTAKEAWAY");
        System.out.println("Widening is usually automatic. Narrowing needs a cast and can lose information.");
        System.out.println("Quick question: what would (int) 8.75 produce, and why?");
    }
}