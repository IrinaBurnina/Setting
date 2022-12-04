package worker;

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}
