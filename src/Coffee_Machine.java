import java.util.*;

public class Coffee_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int water = 1200, milk = 540, coffeeBeans =120, cups = 9, money = 550, totalCups;
        int resWater = 0, resMilk = 0, resCoffeeBeans = 0;
        int canMakeCoffee = 0;

        currentMachineStatus(water, milk, coffeeBeans, cups, money);

        System.out.println("Write action (buy, fill, take): ");
        String strAction = scanner.next();

        switch (strAction)
        {
            case "buy":
                buyFromMachine();
                break;
            case "fill":
                fillMachine();
                break;
            case "take":
                takeFromMachine();
                break;

        }

        /*
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
      */

    }
    public static void currentMachineStatus(int water, int milk, int coffeeBeans, int cups, int money)
    {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }
    public static void buyFromMachine()
    {
        // For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
        // For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
        // And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
        Scanner scanner = new Scanner (System.in);
        int water = 1200, milk = 540, beans =120, cups = 9, money = 550;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 3");
        int action = scanner.nextInt();

        switch (action)
        {
            case 1:
                water = water - 250;
                beans = beans - 16;
                money = money + 4;
                cups = cups - 1;
                break;
            case 2:
                water = water - 350;
                milk = milk - 75;
                beans = beans - 20;
                money =  money + 7;
                cups = cups - 1;
                break;
            case 3:
                water = water - 200;
                milk = milk - 100;
                beans = beans - 12;
                money = money + 6;
                cups = cups - 1;
                break;

        }

        currentMachineStatus(water, milk, beans, cups, money);
    }
    public static void fillMachine()
    {
        Scanner scanner = new Scanner (System.in);
        int water = 1200, milk = 540, beans =120, cups = 9, money = 550;

        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addCups = scanner.nextInt();

        water = water + addWater;
        milk = milk + addMilk;
        beans = beans + addBeans;
        cups = cups + addCups;

        currentMachineStatus(water, milk, beans, cups, money);
    }
    public static void takeFromMachine()
    {
        int water = 1200, milk = 540, beans =120, cups = 9, money = 550;

        System.out.println("I gave you $ " + money);
        money = 0;
        currentMachineStatus(water, milk, beans, cups, money);

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