package urfu.kostromin.lr13;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

  private static int sum = 0;

  private static final int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

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
    System.out.println(sum);
  }

  public static Thread getThread(int start, int end) {
    final Object lock = new Object();
    return new Thread(() -> {
      synchronized (lock) {
        for (int i = start; i < end; i++) {
          sum += numbers[i];
        }
      }
    });
  }
}
