import java.util.Scanner;

class Palin{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String o,r="";
        System.out.println("Enter the string: ");
        o=s.nextLine();
        for ( int i = o.length() - 1; i >= 0; i-- )  {
         r = r + o.charAt(i);  
        }
        if (o.toLowerCase().equals(r.toLowerCase())) {
            System.out.println("Entered string is a palindrome.");  
        }
        else{  
            System.out.println("Entered string isn't a palindrome.");   
        }
        s.close();
    }
}