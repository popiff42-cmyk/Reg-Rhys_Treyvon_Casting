public class Main {
    public static void main(String[] args) {

        // 2 Primary types of casting
        // 1.) Widening Casting
        // 2.) Narrowing Casting

        // 1. Widening Casting (Automatic)
        // Moving from a small bucket (int) to a big bucket (double)
        int smallNumber = 5;
        double bigNumber = smallNumber; 

        System.out.println("1.) Widening Casting:");
        System.out.println("Started with int: " + smallNumber);
        System.out.println("Automatically became double: " + bigNumber); // Outputs 5.0
        System.out.println();


        // 2. Narrowing Casting (Manual)
        // Moving from a big bucket (double) to a small bucket (int)
        double decimalNumber = 5.99;
        int wholeNumber = (int) decimalNumber; 

        System.out.println("2.) Narrowing Casting:");
        System.out.println("Started with double: " + decimalNumber);
        System.out.println("Manually chopped down to int: " + wholeNumber); // Outputs 5
        
    }
}
