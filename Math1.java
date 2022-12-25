//import javax.lang.model.util.ElementScanner14;

public class Math1 {
    
    static void checkPrime(int n){
        int i;
        for ( i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
        if(i==n)
        System.out.println("Prime number");
        else
        System.out.println("Not prime number");
    }
    
    public static void main(String[] args) {
        //Math1 m1= new Math1();
        checkPrime(20);
        //checkodd(12);
    }

}
