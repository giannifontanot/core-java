public class ThreadDemo implements Runnable {
    String threadName;
    Thread thread;

    //Constructor
    ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("New Thread created, name: " + this.threadName);
    }

    //Run method
    @Override
    public void run() {
        // What's the thread doing?
        try {
            for (int i = 5; i > 0; i--) {
                System.out.print(this.threadName + ", printing i = " + i);
                long longWait = (long) (Math.random() * 10000);
                System.out.println(" (" + longWait + ")");
                Thread.sleep(longWait);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted. " + this.threadName);
        }
        System.out.println("Thread finished. " + this.threadName);
    }

    //Start method
    public void start() {
        System.out.println("Starting Thread: " + this.threadName);
        if (this.thread == null) {
            thread = new Thread(this, this.threadName);
        }
        thread.start();
    }

    //Main method
    public static void main(String[] args) {
        ThreadDemo myThread1 = new ThreadDemo("thread-one");
        myThread1.start();
        ThreadDemo myThread2 = new ThreadDemo("thread-two");
        myThread2.start();
    }

}
