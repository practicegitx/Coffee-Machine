import java.util.*;

public class Coffee_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int water, milk, coffeeBeans, cups, totalCups;
        int resWater = 0, resMilk = 0, resCoffeeBeans = 0;
        int canMakeCoffee = 0;

        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();

        resWater = water / 200;
        resMilk = milk / 50;
        resCoffeeBeans = coffeeBeans / 15;

        totalCups = Math.min(resWater, resMilk);
        totalCups = Math.min(totalCups, resCoffeeBeans);


        if (cups * 200 <= water)
        {
            if (cups * 50 <= milk)
            {
                if (cups * 15 <= coffeeBeans)
                  canMakeCoffee = 1;
            }
        }

        if (canMakeCoffee == 1)
        {
            if (totalCups == cups)
                System.out.println("Yes, I can make that amount of coffee");
            else
                System.out.println("Yes, I can make that amount of coffee (and even " + (totalCups - cups) + " more than that)");
        }
        else
            System.out.println("No, I can make only " + totalCups + " cup(s) of coffee");

    }
}

// Yes, I can make that amount of coffee (and even 1 more than that)
// Yes, I can make that amount of coffee
// No, I can make only 0 cup(s) of coffee
// No, I can make only 2 cup(s) of coffee
/*
System.out.println("For 25 cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
 */