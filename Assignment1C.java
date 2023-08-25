import java.util.Scanner;

public class Assignment1C {
    public static void main (String[] args) {
        String animal; // will ask for favorite animal
        System.out.print("Enter your third favorite animal: ");
        Scanner sc = new Scanner (System.in);
        animal = sc.next();

        float meal; // will ask for price of last meal
        System.out.print("Enter the subtotal from your last take-out meal: ");
        Scanner gg = new Scanner (System.in);
        meal = gg.nextFloat();

        short wholeNum; //will aks for whole number
        System.out.print("Enter a whole number less than |32767|: ");
        Scanner mm = new Scanner (System.in);
        wholeNum = mm.nextShort();

        System.out.print("Enter a single letter: ");// will ask for a character
        Scanner cc = new Scanner (System.in);
        char c = cc.nextLine().charAt(0);

        //gives us our passphrase
        System.out.println(animal + " " + meal + " " + wholeNum + " " + c);
        System.out.println("Other variations are: ");
        System.out.println(meal + " " + animal + " " + wholeNum + " " + c);
        System.out.println(wholeNum + " " + meal + " " + animal + " " + c);
        System.out.println(c + " " + wholeNum + " " + meal + " " + animal);
    }
}
