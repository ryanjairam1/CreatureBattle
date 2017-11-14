import java.util.InputMismatchException;
import java.util.Scanner;

public class battleClass {

    public static String pokemon1 = "Rohan";
    public static String pokemon2 = "AJ";

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String x = "";
        String pokemonChoice = "yes";
        String userChoice = "yes";
        int gameTypeChoice = 0;

        while (userChoice.equalsIgnoreCase("yes")) {
            int pokemonOneHP = 100;
            int pokemonTwoHP = 100;
            System.out.println("Welcome to Pokémon battle!");
            System.out.println("Would you like to play singleplayer or multiplayer? (Enter a number)");
            gameTypeChoice = scnr.nextInt();

            if (gameTypeChoice == 1) {

                System.out.println("Pick your Pokemon!:");
                System.out.println(pokemon1);
                System.out.println(pokemon2);
                pokemonChoice = scnr.next();

                while (pokemonOneHP > 0 && pokemonTwoHP > 0) {
                    if (pokemonChoice.equalsIgnoreCase(pokemon1)) {
                        int r = playerAttack.attackOptions1(x);
                        pokemonTwoHP = pokemonTwoHP - r;
                        System.out.println(pokemon2 + "'s HP is " + pokemonTwoHP + "!\n");

                        if (pokemonTwoHP > 0) {
                            int z = botAttack.botAttack2(x);
                            pokemonOneHP = pokemonOneHP - z;
                            System.out.println(pokemon1 + "'s HP is " + pokemonOneHP + "!\n");
                        }
                    }

                    if (pokemonChoice.equalsIgnoreCase(pokemon2)) {
                        int r = playerAttack.attackOptions2(x);
                        pokemonOneHP = pokemonOneHP - r;
                        System.out.println(pokemon1 + "'s HP is " + pokemonOneHP + "!\n");

                        if (pokemonOneHP > 0) {
                            int a = botAttack.botAttack1(x);
                            pokemonTwoHP = pokemonTwoHP - a;
                            System.out.println(pokemon2 + "'s HP is " + pokemonTwoHP + "!\n");
                        }
                    }
                }
            }
            if (gameTypeChoice == 2) {
                System.out.println("Pick your Pokemon!:");
                System.out.println(pokemon1);
                System.out.println(pokemon2);
                pokemonChoice = scnr.next();
                System.out.println("Invalid entry");

                while (pokemonOneHP > 0 && pokemonTwoHP > 0) {
                    if (pokemonChoice.equalsIgnoreCase(pokemon1)) {
                        int r = playerAttack.attackOptions1(x);
                        pokemonTwoHP = pokemonTwoHP - r;
                        System.out.println(pokemon2 + "'s HP is " + pokemonTwoHP + "!\n");

                        if (pokemonTwoHP > 0) {
                            int z = playerAttack.attackOptions2(x);
                            pokemonOneHP = pokemonOneHP - z;
                            System.out.println(pokemon1 + "'s HP is " + pokemonOneHP + "!\n");
                        }
                    }

                    if (pokemonChoice.equalsIgnoreCase(pokemon2)) {
                        int r = playerAttack.attackOptions2(x);
                        pokemonOneHP = pokemonOneHP - r;
                        System.out.println(pokemon1 + "'s HP is " + pokemonOneHP + "!\n");

                        if (pokemonOneHP > 0) {
                            int a = playerAttack.attackOptions1(x);
                            pokemonTwoHP = pokemonTwoHP - a;
                            System.out.println(pokemon2 + "'s HP is " + pokemonTwoHP + "!\n");
                        }
                    }
                }
            } else {
                System.out.println("That is not a valid entry");
                gameTypeChoice = 0;
            }

            if (pokemonOneHP <= 0) {
                System.out.println(pokemon2 + " has won! Play again?");
            }
            if (pokemonTwoHP <= 0) {
                System.out.println(pokemon1 + " has won! Play again?");
            }

            userChoice = scnr.next();
        }
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}