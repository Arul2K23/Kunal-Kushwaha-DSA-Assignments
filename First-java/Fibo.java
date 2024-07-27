import java.util.Scanner;

class Fibo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to find Fiibonacci Series: ");
        int a=0,b=1;
        int n=s.nextInt();
        String seq="0 1 ";
        for (int i=2;i<n;i++){
            
            int temp=a;
            a=b;
            b=temp+b;
            seq=seq+String.valueOf(b)+" ";
        }
        System.out.print(seq);
        s.close();
    }
}