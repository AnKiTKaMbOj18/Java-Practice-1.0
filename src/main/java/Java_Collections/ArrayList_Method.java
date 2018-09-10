package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Method {


    int rollno;
    String name;
    int marks;

    public static List<ArrayList_Method> getListrough(){

        ArrayList_Method r1=new ArrayList_Method();
        r1.rollno=1;
        r1.marks=10;
        r1.name="abc";

        ArrayList_Method r2=new ArrayList_Method();
        r2.rollno=2;
        r2.marks=9;
        r2.name="xyz";

        List<ArrayList_Method> roughs=new ArrayList<>();
        return Arrays.asList(r1,r2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<ArrayList_Method> roughs=getListrough();
        roughs.stream().forEach(data-> System.out.println(data.name+" "+data.marks+" "+data.rollno ));

    }
}
