import java.util.concurrent.ThreadLocalRandom;
public class WhileExample {
    public static void main(String[] args) {
        int money = 50;
        System.out.println("LIttle John has " + money + " dollars to buy candies.\n");

        while (money>0) {
            int candyValue = randomValue();
            if(candyValue > money)
                candyValue = money;

            System.out.println("Candy value: " + candyValue + " spends to added in the cart.");
            money = money - candyValue;
        }

        System.out.println("\n");
        System.out.println("Money: " + money + "\n");
        System.out.println("Little John has spend all money in candies.");
    }
    
    private static int randomValue() {
        return ThreadLocalRandom.current().nextInt(2, 15);
    }

}
