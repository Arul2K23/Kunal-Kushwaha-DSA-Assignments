import java.util.Scanner;

public class Usd{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        double ind,usd;
        System.out.println("Enter the amount of INR: ");
        ind=s.nextDouble();
        usd=ind/83.74;
        System.out.println("The amount of USD: "+usd);
        s.close();
    }
}