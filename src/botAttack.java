import java.util.Random;

public class botAttack extends battleClass {
    public static int botAttack1(String x) {
        Random randGen = new Random();

        int attackChoice;
        String choice1 = "Thunderclap";
        String choice2 = "Surf";
        String choice3 = "Chomp";
        String choice4 = "Swift";
        int damageValue = 0;

        System.out.println(pokemon1 + "'s turn!");

        attackChoice = randGen.nextInt(4);

        if (attackChoice == 1) {
            int accuracy = randGen.nextInt(2);
            if (accuracy != 1) {
                System.out.println(pokemon1 + " uses " + choice1 + "!");
                System.out.println("The opponent was struck!");
                damageValue = 35;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        } else if (attackChoice == 2) {
            int accuracy = randGen.nextInt(5);
            if (accuracy != 5) {
                System.out.println(pokemon1 + " uses " + choice2 + "!");
                System.out.println("The opponent was hit with a tidal wave!");
                damageValue = 20;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        } else if (attackChoice == 3) {
            int accuracy = randGen.nextInt(10);
            if (accuracy != 10) {
                System.out.println(pokemon1 + " uses " + choice3 + "!");
                System.out.println("The opponent was chomped!");
                damageValue = 15;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        } else if (attackChoice == 4) {
            int accuracy = randGen.nextInt(20);
            if (accuracy != 20) {
                System.out.println(pokemon1 + " uses " + choice4 + "!");
                System.out.println("The opponent was hit!");
                damageValue = 10;
            } else {
                System.out.println("The attack missed!");
                damageValue = 0;
            }
        }
        return damageValue;
    }
    public static int botAttack2(String x) {
        Random randGen = new Random();

        int attackChoice;
        String choice1 = "Claw";
        String choice2 = "Rage";
        String choice3 = "Bodyslam";
        String choice4 = "Bleach";
        int damageValue2 = 0;

        System.out.println(pokemon2 + "'s turn!");

        attackChoice = randGen.nextInt(4);
        if (attackChoice == 1) {
            int accuracy = randGen.nextInt(10);
            if (accuracy != 10) {
                System.out.println(pokemon2 + " uses " + choice1 + "!");
                System.out.println("The opponent was struck!");
                damageValue2 = 15;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        } else if (attackChoice == 2) {
            int accuracy = randGen.nextInt(3);
            if (accuracy == 2) {
                System.out.println(pokemon2 + " uses " + choice2 + "!");
                System.out.println("The opponent was wReCkEd!");
                damageValue2 = 60;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        } else if (attackChoice == 3) {
            int accuracy = randGen.nextInt(5);
            if (accuracy != 5) {
                System.out.println(pokemon2 + " uses " + choice3 + "!");
                System.out.println("The opponent was slammed!");
                damageValue2 = 30;
            } else {
                System.out.println("The attack missed!");
                damageValue2 = 0;
            }
        } else if (attackChoice == 4) {
            int accuracy = randGen.nextInt(20);
            if (accuracy != 20) {
                System.out.println(pokemon2 + " uses " + choice4 + "!");
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
