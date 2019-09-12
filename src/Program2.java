//Tiewah Peter

import java.util.Scanner;

public class Program2 {
    public static void main(String []args){
        TossDice();
        System.out.printf("Play Again: Yes/No");
        Scanner YesNo = new Scanner(System.in);
        String newVar = YesNo.nextLine();

        while(!newVar.equals("No")) {
            //newVar = YesNo.nextLine();
            if(newVar.equals("Yes")){
               // System.out.println("sdf");
                TossDice();
                System.out.printf("Play Again: Yes/No");
                 YesNo = new Scanner(System.in);
                newVar = YesNo.nextLine();

            }
        }

    }

    public static void TossDice() {
        int random = (int) ((Math.random() * 6) + 1);
        int random2 = (int) ((Math.random() * 6) + 1);

        int sumToss = random + random2;
        int counter = 1;

        System.out.printf("Tosses:%d %d**", random, random2).println();

        while (sumToss!=8) {
            random = (int) ((Math.random() * 6) + 1);
            random2 = (int) ((Math.random() * 6) + 1);

            sumToss = random + random2;

            counter += 1;
            System.out.printf("Tosses:%d %d**", random, random2).println();
        }

            /**
            if (sumToss == 8) {
                //System.out.printf("The Sum of Your Toss is:" + );
                System.out.printf("Tosses:%d %d**", random, random2);
            } else () (

                    )
             **/

        System.out.printf("You have won in: %d rolls",counter).println();

    }



}
