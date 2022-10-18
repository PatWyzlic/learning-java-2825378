import java.util.Scanner;

public class Main {

    //Function to find meal price with tax and tip included
    public static void calculateTotalMealPrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price with decimal EX: 11.13");

        //Price double, takes user input and turns it into double value
        double price = input.nextDouble();


        //Double for tax rate
        double taxRate = 1.20;
        //Calculate tax from price
        double taxCalculated = ((taxRate * .01) * price); 

        //Question to figure out tip rate
        System.out.println("What would you like to tip % EX. 20");

        
        //Double for tip, takes user input and turns it into double value
        double tip = input.nextDouble();
        double tipCalculated = ((tip * .01) * price); 

        //Double for total
        double total = price + tipCalculated + taxCalculated;

        //Print out results like receipt
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Price: $" + price);
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Tax: $" + taxCalculated);
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Tip: " + tip + "%");
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Tip Total: $" + tipCalculated);
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Total: $" + total);


        
    }

    public static void main(String[] args) {
        calculateTotalMealPrice();
    }

}
