public class Main {
    public static void main(String[] args) {
        // Integer variables
        int intOperandA = 10;
        int intOperandB = 3;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // Double variables
        double doubleOperandA = 10.5;
        double doubleOperandB = 3.0;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        // Extra personal variables
        double myLunchCost = 12.50;
        int numberOfKidsInFamily = 7;
        boolean isItRaining = false;
        double gasPrice = 3.89;
        int favoriteNumber = 42;
        double shoeSize = 10.5;
        int birthMonth = 5;
        String fullName = "Angel Rivera-Diaz";

        System.out.println("My lunch cost: " + myLunchCost);
        System.out.println("Number of kids in my family: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + isItRaining);
        System.out.println("Price of a gallon of gas: " + gasPrice);
        System.out.println("My favorite number: " + favoriteNumber);
        System.out.println("My shoe size: " + shoeSize);
        System.out.println("My birth month: " + birthMonth);
        System.out.println("My full name: " + fullName);
    }
}