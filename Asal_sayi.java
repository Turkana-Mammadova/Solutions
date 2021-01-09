package technoStudy.Sorular;
import java.util.Scanner;

public class Asal_sayi {
    public static void main(String[] args) {

        boolean loop = true;
        while (loop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Alt sinir sayisini giriniz");
            int altsinir = scanner.nextInt();
            System.out.println("Ust sinir sayisini giriniz");
            int ustsinir = scanner.nextInt();

            if (altsinir >= ustsinir) {
                System.out.println("Alt sinir ust sinirdan daha buyuk olmali");
                loop = true;
            } else {loop = false;}

            int ct;
            int number2=1;
            while(number2<ustsinir) {
                number2=1;
                ct=0;
                while(number2<=altsinir) {
                    if(altsinir%number2==0)
                        ct++;
                    number2++;
                }
                if(ct==2)
                {
                    System.out.print(altsinir+" ");

                }
                altsinir++;
            }
        }

        }

}
