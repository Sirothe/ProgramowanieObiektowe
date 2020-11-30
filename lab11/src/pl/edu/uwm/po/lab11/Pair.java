package pl.edu.uwm.po.lab11;

public class Pair<T> {

    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }
    public void swap() {
        this.temp=first;
        this.first=second;
        this.second=this.temp;
    }

    private T temp;
    private T first;
    private T second;
}
