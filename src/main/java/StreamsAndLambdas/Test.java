package StreamsAndLambdas;

public class Test {
    public int count=0;
    public static void main(String[] args) {

        Test[] tests=new Test[3];

        Test test =new Test();
        test.count=5;

        tests[0]=test;

        test=new Test();
        test.count=4;
        tests[1]=test;

        test=new Test();
        test.count=3;
        tests[2]=test;

        int sum =0;
        for(int i=0;i<tests.length;i++){
            sum = sum+tests[i].count;
        }
        System.out.println(sum);
    }
}
