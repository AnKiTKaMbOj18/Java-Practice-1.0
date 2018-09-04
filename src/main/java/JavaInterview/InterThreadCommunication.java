package JavaInterview;

public class InterThreadCommunication extends Thread {

    int amount=10000;

    @Override
    public void run() {
        withdraw(15000);
    }


    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw rs .. "+amount);

        if(this.amount<amount){
            System.out.println("Less balance, Waiting for deposit .. "+this.amount);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount-=amount;
        System.out.println("Withdraw complete of rs .."+amount);
        System.out.println("Balance left after withdraw .. "+this.amount);
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit rs .."+amount);
        this.amount+=amount;
        System.out.println("total balance after deposit in rs .. "+this.amount);
        notify();
    }

    public static void main(String[] args) {

        InterThreadCommunication interThreadCommunication1=new InterThreadCommunication();
        interThreadCommunication1.start();
        interThreadCommunication1.deposit(10000);


    }
}
