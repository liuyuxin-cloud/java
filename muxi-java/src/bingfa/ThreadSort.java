package bingfa;

import java.util.ArrayList;
import java.util.List;

public class ThreadSort {
    public static int[] a = {2, 3, 5, 1, 6, 8, 9};
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < a.length; i++) {
            threadSort(a[i]);
        }
        Thread.sleep(1000);
        System.out.println(list.toString());
    }

    public static void threadSort(int time) {
        Runnable task = () -> {
            try{
                Thread.sleep(time * 2);
                list.add(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        new Thread(task).start();
    }
}

class SonThread extends Thread {
    int a;
    public SonThread() {}

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("子线程运行状态--" + i);
        }
    }
}
