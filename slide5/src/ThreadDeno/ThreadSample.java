package ThreadDeno;

public class ThreadSample {

    public class Employee {

        String currentTask;

        public void setCurrentTask(String t) {
            synchronized (this) {
                currentTask = t.toString();
            }
        }

    }

    public void main(String[] args) throws Exception {
        Employee empl = new Employee();
        Thread t1 = new Thread(() -> {
//            empl.currentTask("Bao cao doanh thu quy");
        }
        );
        t1.setPriority(10);
        t1.start();
        Thread t2 = new Thread(() -> {
//            empl.currentTask("Bao cao doanh thu khach hang");
        }
        );
        t2.start();

        t1.join(); //doi task 1 xong
        t2.join(); //doi task 2 xong
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread 1");
//            }
//        });
//        t1.start();
    }
}
