package CallbackPattern;

abstract class ThreadHolder {
    public final void run(Callback callback) throws InterruptedException {
        run();
        if (callback != null) {
            callback.call();
        }
    }

    public abstract void run() throws InterruptedException;
}
