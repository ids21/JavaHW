
public class main {
    public static void main(String[] args) {
        Deque deque=new Deque();
        System.out.println(deque.isEmpty());
        System.out.println(deque.getSize());
        System.out.println(deque.peekBack());
        deque.PushFront(1);
        deque.PushFront(2);
        deque.PushFront(3);
        deque.PushFront(4);
        deque.PushFront(5);
        deque.PushBack(10);
        System.out.println();
        deque.Print();
        System.out.println();

        System.out.println(deque.PopFront());
        System.out.println(deque.PopBack());
        deque.PushBack(100);
        System.out.println(deque.PopBack());
        System.out.println(deque.PopFront());
        System.out.println(deque.getSize());
        System.out.println(deque.peekFront());
        System.out.println(deque.peekBack());
        System.out.println();

    }
}
