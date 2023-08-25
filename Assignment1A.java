import java.util.Scanner;



public class Assignment1A {
    public static void main(String[] args) {
        short red;
        System.out.print("Enter a red value (0-255)");
        Scanner gg = new Scanner (System.in);
        red = gg.nextShort();

        short green;
        System.out.print("Enter a green value (0-255)");
        Scanner hg = new Scanner (System.in);
        green = hg.nextShort();

        short blue;
        System.out.print("Enter a green value (0-255)");
        Scanner uu = new Scanner (System.in);
        blue = uu.nextShort();


        float percent;
        System.out.print("Percentage to brighten color: ");
        Scanner sc = new Scanner (System.in);
        percent = sc.nextFloat();


        float brightRed = ((255 - red) * percent ) + red;
        float brightGreen = ((255 - green) * percent) + green;
        float brightBlue = ((255 - blue) * percent) + blue;

        System.out.print("A " + percent*100 + "%" + " brighter tint of RGB ");
        System.out.print(" (" + red + "," + green + "," + blue +") is RGB ");
        System.out.print("(" + brightRed + "," + brightGreen + "," + brightBlue + ").");










    }
}