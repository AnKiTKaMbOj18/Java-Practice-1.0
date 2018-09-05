package JavaInterview;

//Inter Thread Communication
// It is all about allowing synchronised threads to communicate with each.
//Cooperation (Inter thread communication is a mechanism in which a thread is paused running in its critical section
// and another thread  is allowed to enter(or lock)  in the same critical section to be executed.It is implemented
//by following methods of Object class.
//wait() , notify() , notifyAll()
// wait() Method: causes current thread to release a lock and wait until either another thread invokes the notify method
// notifyAll() method for this object or a specified time is elapsed.
//notify() method: wakes up the single thread that is waiting on this object's monitor .If any threads are waiting
//on this object,one of them is chosen to be awakened. The choice is arbitrary and occurs at the discretion of
//the implementation , Syntax: public final void notify()
//notifyAll() method: Wakes up all threads that are waiting on this object monitor. Syntax:
//public final void notifyAll()
// Program Example:

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
