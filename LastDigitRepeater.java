import java.util.Scanner;

public class LastDigitRepeater {
    public static void main(String[] args) {
        String str = "";
        int n;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        n = sc.nextInt();
        int length = str.length();
        for (int i = 0; i < length - n; i++) {
            System.out.print(str.charAt(i));
        }
        int j = 0;
        while (j < n)
        {
            for(int k=length-n;k<length;k++)
            {
                System.out.print(str.charAt(k));
            }
            j++;
        }
    }
}