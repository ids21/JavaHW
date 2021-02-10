
public class DList {
    DElement first, last;

    public DList() {
        first = last = null;
    }

    public void addElement(int i) {
        DElement item = new DElement(i);
        if (first == null)
        {
            first = item;
            item.prev = null;
            item.next = null;
        }
        else
        {
            last.next = item;
            item.prev = last;
        }
        last = item;
        }

    public void Display() throws Exception{
        DElement temp = first;
        if(temp==null){
            throw new Exception("List is empty!");
        }
        while(temp!=null){
            System.out.print(temp.x + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertElement(int index,int item)throws Exception {
        DElement temp = first;
        DElement node = new DElement(item);

        if (temp == null){
            first = new DElement(item);
            last= first;
            return;
        }
        for (int i =0; i<index-1; i++){
            temp= temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;

    }

    public boolean deleteElement(int item) throws Exception {
        DElement temp = first;
        DElement node;

        if (temp == null) {
            throw new Exception("cant delete element");
        }

        while (temp != null && temp.x != item ) {
            temp = temp.next;
        }
        if (temp == first) {
            node = temp.next;
            temp = null;
            first = node;
            first.prev = null;

        } else if (temp == last) {
            node = temp.prev;
            node.next = null;
            last = node;

        } else {
            temp = temp.prev;
            node = temp.next.next;
            temp.next = node;
            node.prev = temp;
        }
        return true;
    }

    public boolean removeElement(int index){
        DElement temp = first;
        DElement node;

        if (temp ==null || index <=0) {
            return false;
        }

        int i=1;
        while(temp !=null && i < index) {
            temp = temp.next;
            i++;
        }
        if (temp==null){
            return false;
        }

        if (temp == first) {
            node = temp.next;
            temp = null;
            first = node;
            first.prev = null;
        }
        else if (temp == last) {
            node = temp.prev;
            node.next = null;
            last = node;
        }
        else {
            temp = temp.prev;
            node = temp.next.next;
            temp.next = node;
            node.prev = temp;
        }


        return true;
    }
    public int getNode(int index) throws Exception
    {
        int res =0;
        DElement cur = first;
        for (int i = 0; i < index && cur!=null; i++) {
            cur = cur.next;
            if (i==index){
            res = cur.x;}
            else {
                throw new Exception("cant delete element");
            }
        }
        return res;
    }

        public int indexOfElemnt(int x){
        DElement temp;
        temp = first;
        int i=0;
        int res=0;
        boolean f= false;
        while (temp != null)
        {
            if (temp.x == x){
                res = i;
                f =true;
            }
            temp = temp.next;
            i++;
        }
        if (f) return res;
        else return 0;
    }

    public int countElemnt(int item){
        DElement temp;
        temp = first;
        int res=0;
        while (temp != null) {
            if (temp.x == item) {
                res += 1;
            }
            temp = temp.next;
        }
        return res;
    }

    public int max(){
        DElement temp;
        temp = first;
        int max_ = temp.x;
        while (temp != null) {
            if (max_ < temp.x){
                max_ = temp.x;
            }
            temp = temp.next;
        }
        return max_;
    }
    public int length(){
        DElement temp;
        temp = first;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    public DList copy(DList second){
        DElement temp;
        temp = first;
        while (temp != null) {
            second.addElement(temp.x);
            temp = temp.next;
        }
        return second;
    }
    public void clearList(){
        for (DElement temp = first; temp != null;) {
            DElement next = temp.next;
            temp.next = null;
            temp.prev = null;
            temp = next;
        }
        first = last = null;

    }
    public void sortList(){
        DElement current = null, index = null;
        int temp;
        if(first == null) {
            return;
        }
        else {
            for(current = first; current.next != null; current = current.next) {
                for(index = current.next; index != null; index = index.next) {
                    if(current.x > index.x) {
                        temp = current.x;
                        current.x = index.x;
                        index.x = temp;
                    }
                }
            }
        }
    }
    public boolean equals(DList second){
        DElement current = first;
        DElement temp = second.first;
        if (second.length() != this.length()) {
            return false;
        }
        while (current.next != null) {
            current = current.next;
            temp = temp.next;
            if (!(current.x == temp.x)) {
                return false;
            }
        }
        return true;
    }

    public int maxPalindrome() {
        int result = 0;
        DElement curr = first;
        int n = this.length();
        int[] d1 = new int[n];
        DElement temp = null;
        int max = 0;
        for (int i = 0; i < n && curr != null; ++i) {
            DElement prev_ = curr.prev;
            DElement next_ = curr.next;
            d1[i] = 1;
            while ((i - d1[i] >= 0) && (d1[i] + i < n) && (prev_.x == next_.x)) {
                d1[i]++;
                if (d1[i] > max) {
                    max = d1[i];
                }
                prev_ = prev_.prev;
                next_ = next_.next;
            }

            curr = curr.next;
        }
        return max+1;
    }
}
