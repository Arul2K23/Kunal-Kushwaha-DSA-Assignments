import java.util.Scanner;

public class Greet{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=s.nextLine();
        System.out.println("Hello "+name+"!");
    }
}