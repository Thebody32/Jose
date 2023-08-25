import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args) {
        float mealPrice; // asks for pre-tax meal price
        System.out.print("Enter the total price of the meal: ");
        Scanner sc = new Scanner (System.in);
        mealPrice = sc.nextFloat();

        float tax; // asks for tax rate in decimal form
        System.out.print("Enter the local tax rate: ");
        Scanner gg = new Scanner (System.in);
        tax = gg.nextFloat();

        float service; //asks for service charge
        System.out.print("Enter the service charge: ");
        Scanner hh = new Scanner (System.in);
        service = hh.nextFloat();

        float subtotal = (mealPrice + service); //calculates subtotal
        System.out.println("The subtotal is " + subtotal);

        float total = (subtotal * tax) + subtotal; //calculates total with taxes

        float tenTip = (float) (subtotal * .1); //finds 10 percent tip
        System.out.println ("A 10% tip is: " + tenTip);

        float pay = (total + tenTip);//pre-tax cost with 10 percent tip
        System.out.println("The total would be: " + pay);

        float bigTip = (float) (subtotal * .25); //calculates 25 percent tip
        System.out.println("A 25% tip would be: " + bigTip);

        float pay2 = (total + bigTip); //pre-tax cost with 25 percent tip
        System.out.println("The total would be: " + pay2);




    }
}
