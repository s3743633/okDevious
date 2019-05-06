public class Main {
    public static void main(String[] args){

        npcName("while yelling extremely loudly at you, steve job says");
        boxString("hello welcome to ok devious!");


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
}


