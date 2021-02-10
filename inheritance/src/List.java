public class List {
    Element first;
    public List(){first = null;}
    public void addElement(int x){
        if(first==null){
            first = new Element(x);
            return;
        }
        Element p = first;
        for(;p.getNext() !=null;p=p.getNext());
        p.setNext(new Element(x));
    }
    public void print(){
        System.out.println("=========");
        Element p = first;
        for (;p !=null;p=p.getNext())
            System.out.print(p.getData() + "->");
        System.out.println("\n=========");
    }
    public void addList(List list){
        Element p = first;
        for (;p.getNext() !=null;p=p.getNext());
        Element p1 = list.first;
        for (; p1 !=null;p1=p1.getNext())
            p.setNext(new Element(p1.getData()));
            p = p.getNext();
    }
    public Element find(int x){
        Element p =first;
        for(;p!=null; p=p.getNext()) {
            if(p.getData()==x) return p;
        }
        return null;
    }
}
