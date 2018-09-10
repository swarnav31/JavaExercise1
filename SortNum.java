import java.util.Scanner;
public class SortNum {
    public static void main(String[] args) {
        int n, temp;
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order:");
        for (int i = 0; i < n - 1; i++)
            System.out.print(a[i]+" ");
        System.out.print(a[n - 1]);
        for(int i = 0; i < n; i++)
            if (a[i] % 2 == 0)
                sum = sum + a[i];
        System.out.println("\n");
        System.out.println("Sum of even Numbers : "+sum);
        if(sum>15)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}