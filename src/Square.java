import java.util.*;
public class Square {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Enter number : ");
            int n=sc.nextInt();
            if(n>0) {


                System.out.println("Square of number is "+n*n);
            }
        }
        catch(InputMismatchException i) {
            System.out.println("Enter Number instead of letters");
        }
        catch(NumberFormatException m) {
            System.out.println("Number");
        }
        catch(Exception e){
            System.out.println(e);

        }


    }


}


/*
Enter number :
4
Square of number is 16

Enter number :
e
Enter Number instead of letters

 */