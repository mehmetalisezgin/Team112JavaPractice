package practice.week02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q18 {

  /*
    You or with your family will travel from your home city to another city
    Let's create a java program that calculates the travel ticket of this trip
    1- You can go to Berlin or Frankfurt
    2- Ticket price calculation =  5 euros per 20 km ==> for exm. (for 100km (100/20)*5=25 euro
    Input data:
    -- This travel company is going to 2 cities from your home city
    input  : Berlin : 80 KM , Frankfurt : 90KM
    if user selects Berlin ==>>  output :Direction is  Berlin,ticket is 20 euro
    -- Ask the user that number of tickets
    if there are 2 people ==> output: 2 Tickets for Berlin 40 euro
    --
   */


    public static void main(String[] args) {
        /*
    You or with your family will travel from your home city to another city
    Let's create a java program that calculates the travel ticket of this trip
    1- You can go to Berlin or Frankfurt
    2- Ticket price calculation =  5 euros per 20 km ==> for exm. (for 100km (100/20)*5=25 euro
    Input data:
    -- This travel company is going to 2 cities from your home city
    input  : Berlin : 80 KM , Frankfurt : 90KM
    if user selects Berlin ==>>  output :Direction is  Berlin,ticket is 20 euro
    -- Ask the user that number of tickets
    if there are 2 people ==> output: 2 Tickets for Berlin 40 euro
    --
   */

        Scanner scan = new Scanner(System.in);
        System.out.println("****** Welcome to the Travel Agency ******");
        System.out.println("Frankfurt : 125 Km\n" + "Berlin : 251 Km\n" + "There is a 5 Euro ticket fee per 20 km. ");

        System.out.println("Which City Would You Like To Travel To?");
        String nameOfCity = scan.nextLine();
        String namOfCity2 = nameOfCity.toUpperCase();

        double totalAmount = 0;
        Double balance = 2000.0;
        Double change;

        double frankfurtTicketPrice = (125 / 20) * 5;
        double berlinTicketPrice = (251 / 20) * 5;

        switch (namOfCity2) {

            default:
                System.out.println("we are sorry the " + namOfCity2 + " is not on our list...");
                break;
            case "FRANKFURT":
                System.out.println("Direction is FRANKFURT");
                System.out.println("FRANKFURT is " + frankfurtTicketPrice + "euro");
                System.out.println("How many tickets do you want?(max. can be for 2 person) :");
                int numberOfPerson = scan.nextInt();
                switch (numberOfPerson) {
                    case 1:
                        System.out.println("Direction is Frankfurt for 1 person  ");
                        totalAmount = frankfurtTicketPrice;
                        break;
                    case 2:
                        System.out.println("Direcktion is Frankfurt for 2 person");
                        totalAmount = 2 * frankfurtTicketPrice;
                        break;
                    default:
                        System.out.println("Please input correct data...");
                        break;
                }
                System.out.println("Balance: " + balance);
                System.out.println("Total Amount: " + totalAmount);
                change = balance - totalAmount;
                System.out.println("Change: " + change);
                break;
            case "BERLIN":
                System.out.println("Direction is BERLIN");
                System.out.println("BERLIN is " + berlinTicketPrice + "euro");
                System.out.println("How many tickets do you want?(max. can be for 2 person) :");
                int numberOfPerson1 = scan.nextInt();
                switch (numberOfPerson1) {
                    case 1:
                        System.out.println("Direction is BERLIN for 1 person  ");
                        totalAmount = berlinTicketPrice;
                        break;
                    case 2:
                        System.out.println("Direcktion is BERLIN for 2 person");
                        totalAmount = 2 * berlinTicketPrice;
                        break;
                    default:
                        System.out.println("Please input correct data...");
                        break;
                }
                System.out.println("Balance: " + balance);
                System.out.println("Total Amount: " + totalAmount);
                change = balance - totalAmount;
                System.out.println("Change: " + change);
                break;
        }


    }

}
