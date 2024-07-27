import java.util.Scanner;

public class SimpCalc{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Operator: ");
        double n1,n2,res;
        Character ch=s.next().charAt(0);
        
        
        while (true){

                if(ch=='x' || ch=='X'){
                    break;
                }
                
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                    System.out.println("Enter two Numbers:  ");
                    n1=s.nextDouble();
                    n2=s.nextDouble();
                    if(ch=='+'){
                        res=n1+n2;
                        System.out.println("Ans: "+res);
                    }
                    if(ch=='-'){
                        res=n1-n2;
                        System.out.println("Ans: "+res);
                    }
                    if(ch=='*'){
                        res=n1*n2;
                        System.out.println("Ans: "+res);
                    }
                    if(ch=='%'){
                        res=n1%n2;
                        System.out.println("Ans: "+res);
                    }
                    
                    if(ch=='/'&& n2!=0){
    
                            res=n1/n2;
                            System.out.println("Ans: "+res);
                    }
                }
                else {
                    System.out.println("Enter a valid Operator!!!");
                }
                 System.out.print("Enter the Operator: ");
                ch=s.next().charAt(0);
          
        }
        
        s.close();
        
    }   
}