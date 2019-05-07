public class Main {
    public static void main(String[] args){

        loadScreen();
        npcName("while yelling extremely loudly at you, steve job says");
        boxString("hello welcome to ok devious! Grab em by the legs");


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

        try {


            for (int i = 1; i <= 1; i++) {

                Thread.sleep(1000);
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




}


