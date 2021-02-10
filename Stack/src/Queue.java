class Queue<T>
{
    private class QueueNode
    {
        T data;
        QueueNode next;
        QueueNode(T x){
            data = x;
            next = null;
        }
    }
    QueueNode front, back;
    int size;

    public Queue(){
        front = back = null;
        size = 0;
    }
    public boolean isEmpty(){
        return (front == null);
    }

    public T pop() throws Exception{
        if(isEmpty())
            throw new Exception("queue is empty");
        QueueNode temp = front;
        front = front.next;
        size--;
        return temp.data;
    }

    public void push(T data)
    {
        QueueNode temp = new QueueNode(data);
        if(isEmpty())
        {
            front = back = temp;
        }
        else
        {
            back.next = temp;
            back = temp;
        }
        size++;
    }

    public int getSize() {
        return size;
    }
}