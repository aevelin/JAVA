package ee.esimene;

public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, Evelin!");

        int myFirstNumber = 11 + 11;
        System.out.println(myFirstNumber);

        int mySecondNumber = (11 + 11) + (11 * 11);
        int myThirdNumber = 6;
        int myFourthNumber = myFirstNumber + 7;

        int myTotal = mySecondNumber + myThirdNumber + myFourthNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);
    }
}
