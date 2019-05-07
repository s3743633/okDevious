import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //loadScreen();
        int userChoice;

        Scanner input = new Scanner(System.in);
        List<String> inv = new ArrayList<String>();


        System.out.println("you went north from shipwreck cove and find the carnage of your much loved ship.");
        System.out.println("what would you like to do?");
        System.out.println();

        userChoice = a3menu();

        if (userChoice == 1){
            hpBar();
            for (int i = 1; i<=10; i++) {
                a3menu();
            }
        }else if (userChoice == 2){
            b3menu();
        }else if (userChoice == 3){
            a3content();
        }

        userChoice = a3amenu();

        System.out.println("The armour was added to your inventory");
        if (userChoice == 1){
            inv.add("rusty armour");
            System.out.println("Inventory: ");
            System.out.println(inv);
            a3a1menu();

        }else if (userChoice == 2){
            b3menu();
        }



  //      if (userChoice == 1){
       //     hpBar();
        //}else if (userChoice == 2){

       // }



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
        System.out.println("enter 2 to go west");

        selection = input.nextInt();
        return selection;

    }

    public static int a3menu(){

        int selectionA3;
        Scanner inputA3 = new Scanner(System.in);
        System.out.println("enter 1 to show current HP");
        System.out.println("enter 2 to go East");
        System.out.println("enter 3 to search the shipwreck ruins");

        selectionA3 = inputA3.nextInt();
        return selectionA3;
    }

    public static void a3content(){
        System.out.println("you searched the ruins and find some rusty armour");
        System.out.println("what would you like to do?");

        a3amenu();

    }

    public static void b3menu(){
        System.out.println("as you reach the top of the hill, you see a never ending span of trees");
        System.out.println("you notice that there is only 1 road, leading south and north");
        System.out.println("where do you want to go?");
    }

    public static int a3amenu(){

        int selectionA3a;
        Scanner inputA3a = new Scanner(System.in);
        System.out.println("enter 1 to equip armour");
        System.out.println("enter 2 to go east");

        selectionA3a = inputA3a.nextInt();
        return selectionA3a;

    }

    public static int a3a1menu(){
        int selectionA3a1;
        Scanner inputA$a1 = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("enter 1 to go east");
        System.out.println("enter 2 to go south");

        selectionA3a1 = inputA$a1.nextInt();
        return selectionA3a1;
    }
}


