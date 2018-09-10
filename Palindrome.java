import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n;
        n=sc.nextLong();
        long m=n;
        long pal=0;
        int sum=0;
        do{
            long temp=n%10;
            if(temp%2==0)
                sum=sum+(int)temp;
            pal=pal*10+temp;
            n=n/10;
        }while(n>0);
        if(m==pal)
        {
            if(sum>25)
                System.out.println("Palindrome and sum of even numbers greater than 25");
            else
                System.out.println("Palindrome and sum of even numbers lesser than 25");
        }
        else
            System.out.println("Number is not palindrome");
    }

}
