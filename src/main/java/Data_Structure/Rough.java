package Data_Structure;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rough {

    public static void prime(int p1,int p2){


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
        System.out.println("prime numbers between "+p1+" and "+p2 +" are: ");
        for(int j=0;j<prime.size();j++){
            System.out.println(prime.get(j));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        LocalDate localDate=LocalDate.of(2017, Month.NOVEMBER,28);
        System.out.println(localDate);*/

        System.out.println("Enter the starting number : ");
        int a=sc.nextInt();
        System.out.println("Enter the end number: ");
        int b=sc.nextInt();

        prime(a,b); //finding all prime numbers between a and b
    }
}