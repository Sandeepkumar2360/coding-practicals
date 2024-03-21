public class TestSingletonUsingThreads {

    public static void main(String[] args) {


        Runnable r =  () -> {
            synchronized (TestSingletonUsingThreads.class) {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i +" : "+Employee.getSingletonObject());
                }
                System.out.println(Thread.currentThread().getName() + " finished execution");
            }
        };

        Thread t1  = new Thread(r);
        t1.setName("Thread-1");

        Thread t2  = new Thread(r);
        t2.setName("Thread-2");


        Thread t3  = new Thread(r);
        t3.setName("Thread-3");
        t3.start();
        t2.start();
        t1.start();

        System.out.println(Thread.currentThread().getName()+" finished execution");


    }
}

