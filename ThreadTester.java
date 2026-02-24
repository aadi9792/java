public class ThreadTester extends Thread {
    public void run(){
        System.out.println("in run" +getState());
        System.out.println("Thread Running");
    }
    public static void main(String[] args) throws Exception {
        ThreadTester t1 = new ThreadTester();
        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println("Ending  of main method");
        System.out.println(t1.getState());
    }
}

