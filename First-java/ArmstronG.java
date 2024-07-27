import java.util.Scanner;
import java.lang.Math;

class Armstrong{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two Numbers to find Armstrong number among them: ");
        Integer n1=s.nextInt();
        Integer n2=s.nextInt();
        String st1=n1.toString();
        String st2=n2.toString();
        int val1,val2;
        double res1=0,res2=0;

        for(int i=0;i<st1.length();i++){
            val1=Integer.parseInt(String.valueOf(st1.charAt(i)));
            
            res1=res1+Math.pow(val1,st1.length());
        }
        for(int i=0;i<st2.length();i++){
            val2=Integer.parseInt(String.valueOf(st2.charAt(i)));
            
            res2=res2+Math.pow(val2,st2.length());
        }
        if(res1==n1){
            if(res2==n2){
                System.out.println("The given number "+n1+" and "+n2+" is an Armstrong Number.");    
            }
            else{
                System.out.println("The given number "+n1+" is an Armstrong Number.");
            }
            
        }
        else if(res2==n2){
            System.out.println("The given number "+n2+" is an Armstrong Number.");
        }
        else{
            System.out.println("The given numbers aren't an Armstrong Number.");
        }

        s.close();
    }
}