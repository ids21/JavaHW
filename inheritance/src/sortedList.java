public class sortedList extends List {
    public sortedList(){super();}
    @Override
    public void addElement(int x) {
        if(first==null){
            first = new Element(x);
            return;}
        if  (x<first.getData()) {
        Element temp = first;
        first = new Element(x);
        first .setNext(temp);
        return;
    }
        Element p=first;
        for(;p.getNext()!=null && p.getNext().getData() < x; p=p.getNext());
        Element temp = p.getNext();
        p.setNext(new Element(x));
        p.getNext().setNext(temp);

    }
    @Override
    public void addList(List list){
        Element p = list.first;
        for (;p!=null;p=p.getNext())
            addElement(p.getData());
    }
}
