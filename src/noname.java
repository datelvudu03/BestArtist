import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class noname {
    public static void main(String[] args) {
        double subtotal = 0,gratuityRate = 0;
        boolean inputS = false;
        boolean inputG = false;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the subtotal: ");
                subtotal = input.nextDouble();
                inputS = true;
            }catch (Exception ex){
                System.out.println("The subtotal must be a number. Try again:");
            }
        }while (!inputS);
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the gratuity rate(%):");
                gratuityRate = input.nextDouble();
                gratuityRate /= 100;
                inputG = true;
            }catch (Exception ex){
                System.out.println("The gratuity rate has to be a number. Try again:");
            }
        }while (!inputG);
        String gratuity = String.valueOf(Math.round(subtotal*gratuityRate*100.0)/100.0);
        String total = String.valueOf(Math.round((subtotal + subtotal*gratuityRate)*100.0)/100.0);
        System.out.println("The gratuity is $"+gratuity+" and the total is $" + total);



    }

}
