package interview.multithreads;

import java.util.ArrayList;
import java.util.List;

public class Program {

    // only this class can be changed

    void run(ResultProcessor resultCallback) {
        List<Thread> threads = prepareThreads(resultCallback); // do not touch this line

        threads.forEach(Thread::start);
    }

    private void doWork(ResultProcessor resultCallback, Worker worker) {
        int result = worker.work();
        resultCallback.process(result);
    }

    // do not touch
    private List<Thread> prepareThreads(ResultProcessor resultCallback) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < resultCallback.getWorkToBeDone(); i++) {
            int id = i;
            Thread thread = new Thread(() -> {
                Worker worker = new Worker(id);
                doWork(resultCallback, worker);
            });
            threads.add(thread);
        }
        return threads;
    }

}
