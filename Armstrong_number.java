package technoStudy.Sorular;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            System.out.println("Enter your number please: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int sum = 0;
            String array[] = Integer.toString(num).split("");
            for (int i = 0; i < array.length; i++) {

                sum += Math.pow(Integer.parseInt(array[i]), 4);
            }
            if (num == sum) {
                System.out.println("This is an Armstrong number");
            } else {
                System.out.println("This is not an Armstrong number");
            }

            System.out.println("Do you want to continue?");
            Scanner ressolution=new Scanner(System.in);
            String res=(ressolution.nextLine()).toLowerCase();
            if (res.equals("yes")) {
                loop=true;
            }else loop=false;
        }
    }
}