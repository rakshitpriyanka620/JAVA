import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,n1,rev=0,rem;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        n1=n;
         while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==n1){
            System.out.println("Palimdrome no");
        }else{
            System.out.println("Not palindrome no");
        }
    }
}
