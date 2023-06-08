package urfu.kostromin.lr13;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

  private static int max = 0;

  private static final int[] numbers = { 102, 5, 73, 6, 27, 7, 29, 8, 4, 11, 5, 34, 6, 135, 2, 87, 9, 8, 43, 10, 35, 3, 6, 2, 7, 49, 80 };

  public static void main(String[] args) throws InterruptedException {

    int processors = Runtime.getRuntime().availableProcessors();
    int arrayPart = numbers.length / processors;

    List<Thread> threads = new ArrayList<>();
    for (int i = 0; i < processors; i++) {
      threads.add(getThread(arrayPart * i, arrayPart * i + arrayPart));
    }

    threads.forEach(Thread::start);
    for (Thread thread: threads) {
      thread.join();
    }
    System.out.println(max);
  }

  public static Thread getThread(int start, int end) {
    final Object lock = new Object();
    return new Thread(() -> {
      synchronized (lock) {
        for (int i = start; i < end; i++) {
          if (max < numbers[i]) {
            max = numbers[i];
          }
        }
      }
    });
  }
}
