package JavaInterview;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeAmongMany {

    public static void primeMany(int p1, int p2) {

        int i=2;

        List<Integer> prime=new ArrayList<>();

        for(int p=p1;p<=p2;p++){

            for(i=2;i<10;i++){

                if(p%i==0 && p!=i){
                    break;
                }
            }
            if(i==10){
                prime.add(p);
            }
        }

        System.out.println("Prime numbers between "+p1+" and "+p2+" are: ");
        for(int j=0;j<prime.size();j++){
            System.out.println(prime.get(j));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from where you wish to start finding prime number: ");
        int a = sc.nextInt();
        System.out.println("Enter number until you want to check for prime numbers");
        int b = sc.nextInt();

        primeMany(a, b);

    }
}
