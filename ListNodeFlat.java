package akm;

public class ListNodeFlat {
    int data;
    ListNodeFlat bottom,next;

    public ListNodeFlat() {
    }

    public ListNodeFlat(int data) {
        this.data = data;
    }

    public ListNodeFlat(int data, ListNodeFlat bottom) {
        this.data = data;
        this.bottom = bottom;
    }

    public ListNodeFlat(int data, ListNodeFlat bottom, ListNodeFlat next) {
        this.data = data;
        this.bottom = bottom;
        this.next = next;
    }
}
