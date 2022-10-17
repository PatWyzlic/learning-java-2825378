import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for dev tea time...");
        System.out.println("Type word and press enter");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Time for tea!");
    }

    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}
