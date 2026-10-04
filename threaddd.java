class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    public void run() {

        int sum = 0;

        for (int x = 0; x < 10; x++) {

            sum = sum + x;

            System.out.println(
                "Thread: " + getName() + " value: " + sum
            );
        }

        System.out.println(
            "Thread: " + getName() + " Sum: " + sum
        );
    }
}

public class Main {

    public static void main(String[] args) {

        MyThread A = new MyThread("A");
        MyThread B = new MyThread("B");
        MyThread C = new MyThread("C");

        A.start();
        B.start();
        C.start();
    }
}
