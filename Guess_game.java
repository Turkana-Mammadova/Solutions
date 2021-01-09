package technoStudy.Sorular;

import java.util.Random;
import java.util.Scanner;

public class Guess_game {
    public static void main(String[] args) {
        Random random = new Random();
        int randomGenerator = random.nextInt(100 + 1);

        int count = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter your number please: ");
            Scanner scanner = new Scanner(System.in);
            int inputnumber = scanner.nextInt();
            count++;
            if (inputnumber < randomGenerator) {
                    System.out.println("Your number is lower");
                }
            if (inputnumber > randomGenerator) {
                    System.out.println("Your number is higher");
                }
            if (inputnumber == randomGenerator) {
                    System.out.println("YOU ARE WINER !!");
                    break;
            }

            }System.out.println(count);
        }
    }


