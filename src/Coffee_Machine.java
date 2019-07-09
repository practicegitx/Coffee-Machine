import java.util.*;

public class Coffee_Machine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //int water = 400, milk = 540, beans = 120, cups = 9, money = 550;
        int machineResources [] = {400, 540, 120, 9, 550};
        int done = 1;

        do
        {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String strAction = scanner.next();
        switch (strAction)
        {
            case "buy":
                buyFromMachine(machineResources);
                break;
            case "fill":
                fillMachine(machineResources);
                break;
            case "take":
                takeFromMachine(machineResources);
                break;
            case "remaining":
                currentMachineStatus(machineResources);
                break;
            case "exit":
                done = 0;
                break;

        }
        }while (done == 1);

        /*
        int totalCups;
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
      */

    }
    public static void currentMachineStatus(int resources[])
    {

        System.out.println("The coffee machine has:");
        System.out.println(resources[0] + " ml of water");
        System.out.println(resources[1] + " ml of milk");
        System.out.println(resources[2] + " g of coffee beans");
        System.out.println(resources[3] + " of disposable cups");
        System.out.println(resources[4] + " of money");

    }
    public static void buyFromMachine(int resources[])
    {
        // For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
        // For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
        // And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
        Scanner scanner = new Scanner (System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String action = scanner.next();
        int done = 1;
        switch (action)
        {
            case "1":
                if (resources[0] - 250 < 0)
                    System.out.println("Sorry, not enough water!");
                else if (resources[2] - 16 < 0)
                    System.out.println("Sorry, not enough beans!");
                else if (resources[3] - 1 < 0)
                    System.out.println("Sorry, not enough cups!");
                else
                {
                resources[0] = resources[0] - 250;
                resources[2] = resources[2] - 16;
                resources[3] = resources[3] - 1;
                resources[4] = resources[4] + 4;
                }
                break;
            case "2":
                if (resources[0] - 350 < 0)
                    System.out.println("Sorry, not enough water!");
                else if (resources[1] - 75 < 0)
                    System.out.println("Sorry, not enough milk!");
                else if (resources[2] - 20 < 0)
                    System.out.println("Sorry, not enough beans!");
                else if (resources[3] - 1 < 0)
                    System.out.println("Sorry, not enough cups!");
                else
                {
                resources[0] = resources[0] - 350;
                resources[1] = resources[1] - 75;
                resources[2] = resources[2] - 20;
                resources[3] = resources[3] - 1;
                resources[4] =  resources[4] + 7;
                }
                break;
            case "3":
                if (resources[0] - 200 < 0)
                    System.out.println("Sorry, not enough water!");
                else if (resources[1] - 100 < 0)
                    System.out.println("Sorry, not enough milk!");
                else if (resources[2] - 12 < 0)
                    System.out.println("Sorry, not enough beans!");
                else if (resources[3] - 1 < 0)
                    System.out.println("Sorry, not enough cups!");
                else
                {
                resources[0] = resources[0] - 200;
                resources[1] = resources[1] - 100;
                resources[2] = resources[2] - 12;
                resources[3] = resources[3] - 1;
                resources[4] = resources[4] + 6;
                }
                break;
            case "back":
                done = 0;
                break;

        }
        if (done == 1)
            System.out.println("I have enough resources, making you a coffee!");
        //currentMachineStatus(water, milk, beans, cups, money);
    }
    public static void fillMachine(int resources[])
    {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addCups = scanner.nextInt();

        resources[0] = resources[0] + addWater;
        resources[1] = resources[1] + addMilk;
        resources[2] = resources[2] + addBeans;
        resources[3] = resources[3] + addCups;

        currentMachineStatus(resources);
    }
    public static void takeFromMachine(int resources[])
    {


        System.out.println("I gave you $ " + resources[4]);
        resources[4] = 0;
        currentMachineStatus(resources);

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