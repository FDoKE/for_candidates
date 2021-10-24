package interview.multithreads;

public class Worker {
    private final int id;

    public Worker(int id) {
        this.id = id;
    }

    public int work() {
        try {
            Thread.sleep((long) (2000. + Math.random() * 100));
        } catch (InterruptedException ignored) {
        }

        return id;
    }

    public int getId() {
        return id;
    }
}
