public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker (OnTaskDoneListener callback, OnTaskErrorListener errorCallback){
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(){
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                errorCallback.onError("ERROR!!! Task " + i + " isn't done!!!");
            } else {
                callback.onDone("Task " + i + " is done.");
            }
        }
    }
}
