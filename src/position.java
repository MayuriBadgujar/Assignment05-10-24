import java.util.*;

public class position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        try {
            System.out.println("Enter key : ");

            int key = sc.nextInt();
//			for (int i = 0; i < n; i++) {
//
//				if (key == a[i]) {
//					System.out.println("Value of " + key + " is present at " + i+" position");
//				}
//			}
            System.out.println("Output = "+a[key]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-1");


        }


        catch(Exception e1) {
            System.out.println("Error");
        }


    }

}

/*
 * Enter the size of array
3
1 2 3
Enter key :
2
Value of 2 is present at 1 position*/

