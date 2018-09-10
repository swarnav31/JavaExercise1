/*
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.exit;

public class Total {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
            String input = sc.nextLine();
        System.out.println("input" + input);
            String[] arr=input.split("//s+");
            String str = "hello how are u";

            String data[]=str.split("//s+");
       // System.out.println(arr);
        for (String str1:data
             ) {
            System.out.println(str1);


        }
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("arr" + arr[i]);
                try {
                    int n=Integer.parseInt(arr[i]);
                    sum = sum + n;
                    System.out.println("sum is" + sum);
                }
                catch (NumberFormatException nFE) {
                    System.out.println("Not an Integer");
                }
            }
        System.out.println(sum);
    }
}
*/


public class Total{


    public static void main(String[] args) {

        String str = "Hello how are u";
        String str1[] = str.split("//s++");
        for (String str2:str1
             ) {
            System.out.println("str2" + str2);

        }


    }

}