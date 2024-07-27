import java.util.Scanner;

public class Max{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two numbers: ");
        n1=s.nextInt();
        n2=s.nextInt();
        if(n2>n1){
            System.out.println("Max: "+n2);
        }
        else{
            System.out.println("Max: "+n1);
        }
        s.close();
    }
}