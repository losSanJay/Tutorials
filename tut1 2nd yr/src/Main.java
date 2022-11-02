import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to online learning\n");
        System.out.println("Please virus go away");

       /* int i;
        int n=100;
        for (i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println( i+ " ");
            }
        }*/
        /*int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i=i+1;



        }*/


        Random rand = new Random();
        int Min=0, Max=8;
        int i;
        for(i=0;i<5;i++){
            System.out.println(rand.nextInt(Min,Max));
        }



    }
}
