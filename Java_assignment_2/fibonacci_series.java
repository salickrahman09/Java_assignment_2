import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
      

        // 0 1 1 2 3 5 8 13

        int a=0, b=1,  c;
        System.out.println("Enter your condition");
        Scanner Scanner=new Scanner(System.in);
        int n=Scanner.nextInt();
        Scanner.close();
        for(int i=1; i<=n; i++) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}