package worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(int error) {
        for (int i = 0; i < 100; i++) {
            if (i != error) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Error. Task " + i + " isn't done. ");
            }
        }
    }
}
