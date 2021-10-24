package interview.multithreads;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ResultProcessor {
    private final int workToBeDone;
    private final Deque<Integer> results = new ConcurrentLinkedDeque<>();

    public ResultProcessor(int workToBeDone) {
        this.workToBeDone = workToBeDone;
    }

    public void process(int result) {
        results.addLast(result);
    }

    public Deque<Integer> getResults() {
        return results;
    }

    public int getWorkToBeDone() {
        return workToBeDone;
    }
}
