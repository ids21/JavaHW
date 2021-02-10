public class Deque {
    Node head;
    Node tail;
    int size;
    public Deque(){
        tail=null;
        head=null;
        size=0;
    }
    public void PushFront(int item) {
        if (head == null && tail == null) {
            head = new Node();
            head.setData(item);
            head.setNext(null);
            tail = head;
        } else {
            Node node = new Node();
            node.setData(item);
            node.setNext(head);
            head = node;
        }
        size++;
    }
    public void PushBack(int element){
        Node node=new Node(element);
        if(isEmpty()){
            head=node;
            tail=node;
            size++;
        }
        else{
            tail.setNext(node);
            tail=node;
            size++;
        }

    }
    public int PopFront(){
        int res=0;
        if(head==null){
            System.out.print("deque is empty");

        }
        else{
            res=head.getData();
            head=head.getNext();
            size--;
        }
        return res;
    }

    public int PopBack(){
        int res=0;
        if(head==null){
            System.out.print("deque is empty");

        }
        else{
            res=tail.getData();
            tail.setNext(head);
            size--;
        }
        return res;
    }

    public int peekFront() {
        int res = 0;
        if (head == null) {
            System.out.print("deque is empty");
        } else {
            res=head.getData();
        }
        return res;
    }
    public int peekBack() {
        int res = 0;
        if (head == null) {
            System.out.print("deque is empty");
        } else {
            res=tail.getData();
        }
        return res;
    }

    public boolean isEmpty(){
        boolean res=false;
        if(size==0){
            res=true;
        }
        return res;
    }


    public int getSize(){
        return size;
    }
    public void Print(){
        Node node=head;
        if(head==null){
            System.out.print("deque is empty");

        }
        else{
            while(node.getNext() !=null ){
                System.out.println(node.getData());
                node = node.getNext();
            }
        }
    }

}