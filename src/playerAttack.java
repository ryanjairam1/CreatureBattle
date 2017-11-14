import java.util.Random;
import java.util.Scanner;

public class playerAttack extends battleClass {


    public static int attackOptions1(String x) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        String attackChoice;
        String choice1 = "Thunderclap";
        String choice2 = "Surf";
        String choice3 = "Chomp";
        String choice4 = "Swift";
        int damageValue = 0;

        System.out.println(pokemon1 + "'s turn! Pick an attack:\n");
        System.out.println(choice1);
        System.out.println(choice2);
        System.out.println(choice3);
        System.out.println(choice4);

        attackChoice = scnr.nextLine();

        if (attackChoice.equalsIgnoreCase(choice1)) {
            int accuracy = randGen.nextInt(2);
            if (accuracy != 1) {
                System.out.println("The opponent was struck!");
                damageValue = 35;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        } else if (attackChoice.equalsIgnoreCase(choice2)) {
            int accuracy = randGen.nextInt(5);
            if (accuracy != 3) {
                System.out.println("The opponent was hit with a tidal wave!");
                damageValue = 20;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        } else if (attackChoice.equalsIgnoreCase(choice3)) {
            int accuracy = randGen.nextInt(10);
            if (accuracy != 8) {
                System.out.println("The opponent was chomped!");
                damageValue = 15;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        } else if (attackChoice.equalsIgnoreCase(choice4)) {
            int accuracy = randGen.nextInt(20);
            if (accuracy != 13) {
                System.out.println("The opponent was hit!");
                damageValue = 10;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        }
        return damageValue;
    }

    public static int attackOptions2(String x) {
        Scanner scanner = new Scanner(System.in);
        Random randGen = new Random();

        String attackChoice;
        String choice1 = "Claw";
        String choice2 = "Rage";
        String choice3 = "Bodyslam";
        String choice4 = "Bleach";
        int damageValue2 = 0;

        System.out.println(pokemon2 + "'s turn! Pick an attack:\n");
        System.out.println(choice1);
        System.out.println(choice2);
        System.out.println(choice3);
        System.out.println(choice4);

        attackChoice = scanner.nextLine();
        if (attackChoice.equalsIgnoreCase(choice1)) {
            int accuracy = randGen.nextInt(10);
            if (accuracy != 10) {
                System.out.println("The opponent was struck!");
                damageValue2 = 15;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        } else if (attackChoice.equalsIgnoreCase(choice2)) {
            int accuracy = randGen.nextInt(3);
            if (accuracy == 2) {
                System.out.println("The opponent was wReCkEd!");
                damageValue2 = 60;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        } else if (attackChoice.equalsIgnoreCase(choice3)) {
            int accuracy = randGen.nextInt(5);
            if (accuracy != 5) {
                System.out.println("The opponent was slammed!");
                damageValue2 = 30;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        } else if (attackChoice.equalsIgnoreCase(choice4)) {
            int accuracy = randGen.nextInt(20);
            if (accuracy != 20) {
                System.out.println("The opponent was bleached!");
                damageValue2 = 20;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        }
        return damageValue2;
    }
}
