public class Element {
    private int data;
    private Element next;
    public Element(int data) {
        this.data = data;
        next=null;
    }
    public Element(){
        next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
