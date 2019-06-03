import java.util.Scanner;

public class Main {


    static void state(int water,int milk,int cups,int beans,int paise)
    {
        System.out.printf("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "%d of money\n",water,milk,beans,cups,paise);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int water,milk,beans,cups,paise,n;
        paise=550;
        water=400;
        milk=540;
        beans=120;
        cups=9;


        String action;
        while(true)
        {
        System.out.println("Write action (buy, fill, take,remaining,exit):");
        action=sc.nextLine();
        if(action.equalsIgnoreCase("fill"))
        {
            System.out.println("Write how many ml of water do you want to add:");
            water+=sc.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            milk+=sc.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            beans+=sc.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            cups+=sc.nextInt();
            continue;
        }
        else if(action.equalsIgnoreCase("buy"))
        {
            String b;
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino back - to main menu:");
            b=sc.nextLine();
            if(b.equalsIgnoreCase("back"))
                continue;
            int buy=Integer.parseInt(b);
            switch (buy)
            {
                case 1:
                {
                    if(water<250)
                    {
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if(cups<1)
                    {
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                    if(beans<16)
                    {
                        System.out.println("Sorry, not enough beans!");
                        break;
                    }
                    cups--;
                    beans=beans-16;
                    water=water-250;
                    paise+=4;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
                case 2:
                {
                    if(water<350)
                    {
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if(cups<1)
                    {
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                    if(beans<20)
                    {
                        System.out.println("Sorry, not enough beans!");
                        break;
                    }
                    if(milk<75)
                    {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    }
                    cups--;
                    beans-=20;
                    milk-=75;
                    water-=350;
                    paise+=7;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
                case 3:
                {
                    if(water<200)
                    {
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if(cups<1)
                    {
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                    if(beans<12)
                    {
                        System.out.println("Sorry, not enough beans!");
                        break;
                    }
                    if(milk<100)
                    {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    }
                    cups--;
                    beans-=12;
                    water-=200;
                    milk-=100;
                    paise+=6;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            }
        }
        else if(action.equalsIgnoreCase("take"))
        {
            System.out.printf("I gave you $%d\n",paise);
            paise=0;
        }
        else if(action.equalsIgnoreCase("remaining"))
        {
            state(water,milk,cups,beans,paise);
        }
        else if(action.equalsIgnoreCase("exit"))
            break;
        }

    }
}
