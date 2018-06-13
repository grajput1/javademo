package threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(3);
        executorService.execute(processor);

        Runnable processor2 = new MessageProcessor(4);
        executorService.execute(processor2);

        Runnable processor3 = new MessageProcessor(5);
        executorService.execute(processor3);

        Runnable processor4 = new MessageProcessor(6);
        executorService.execute(processor4);

        executorService.shutdown(); // Makes executerService to shutdown gracefully

        while(!executorService.isTerminated())
        {
            //Let threads complete their work before printing "Submitted all tasks"
        }
        System.out.println("Submitted all tasks");
    }
}
