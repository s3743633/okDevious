import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //loadScreen();
        int userChoice;

        Scanner input = new Scanner(System.in);
        userChoice = menu();

        if (userChoice == 1){
            hpBar();
        }



    }


    public static void boxString(String contents) {

        int n = contents.length();
        for (int i = 0; i < n + 6; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("| \"" + contents + "\" |");
        for (int i = 0; i < n + 6; i++) {
            System.out.print("*");
        }
        System.out.println();

    }


    public static void npcName(String name){
        System.out.println();
        System.out.println(name + ": ");
        System.out.println();



    }

    public static void loadScreen(){

        System.out.println("okDevious is loading...please wait");
        try

        {
            for(int i=0;i<=10;i++){
                System.out.print("** ");
                Thread.sleep(300); // this should pause the program or the loop
            }
            System.out.println();
        }

        catch(Exception e){

        }

        System.out.println("Loading completed!!");
        System.out.println();

        try {


            for (int i = 1; i <= 1; i++) {

                Thread.sleep(2000);
                System.out.println("*******************************************************************************************");
                System.out.println();
                System.out.println("      ******     *     *      ****    *****  *       *  ***  ******   *    *  ****         ");
                System.out.println("     *      *    *   *        *   *   *       *     *    *  *      *  *    *  *            ");
                System.out.println("     *      *    * *          *    *  *****    *   *     *  *      *  *    *  ****         ");
                System.out.println("     *      *    *   *        *   *   *         * *      *  *      *  *    *     *         ");
                System.out.println("      ******     *     *      ****    *****      *      ***  ******   ******  ****         ");
                System.out.println();
                System.out.println("*******************************************************************************************");
            }
        }
        catch(Exception e){
        }


    }


    public static void hpBar(){

        double hp = 10.0;

        System.out.println("current hp is: " + (hp * 10));
        System.out.print("|");
        for (int i = 1; i<= hp; i++){
            System.out.print("*");
        }
        System.out.print("|");
        System.out.println();


    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("choose what you want to do:");
        System.out.println("--------------------------\n");
        System.out.println("enter 1 to show current HP");

        selection = input.nextInt();
        return selection;

    }

}


