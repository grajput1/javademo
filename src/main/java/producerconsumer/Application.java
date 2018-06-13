package producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> questionList = new ArrayList<>();

        Thread producer = new Thread(new Producer(questionList));
        Thread consumer = new Thread(new Consumer(questionList));

        producer.start();
        consumer.start();
    }
}
