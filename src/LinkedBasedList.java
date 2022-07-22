
public class LinkedBasedList implements IntList{

    private IntNode head=null;

    //Appends the specified element to the end of this list.
    @Override
    public boolean add(int e) {
        if (head==null) {
            head=new IntNode(e);
            return true;
        }
        else {
            IntNode walk=head;
            while(walk!=null) {
                if(walk.next==null)//if walk refers to the last node
                    break;
                walk=walk.next;
            }
            walk.next=new IntNode(e);
        }
        return false;
    }

    public void printList() {
        IntNode walk=head;
        System.out.println("List:");
        while(walk!=null) {
            System.out.print(walk.data+"->");
            walk=walk.next;
        }
        System.out.println("null");
    }

    @Override
    public void add(int index, int element) {
        if(index<=size() && index>=0) {
            IntNode newNode=new IntNode(element);
            if(index==0) {
                newNode.next=head;
                head=newNode;
            }
            else {
                int cnt=0;
                IntNode walk=head,prev=null;
                while(walk!=null) {
                    cnt++;
                    prev=walk;
                    walk=walk.next;
                    if(cnt==index)
                        break;
                }
                newNode.next=walk;
                prev.next=newNode;

            }
        }

    }

    @Override
    public void clear() {
        head=null;

    }

    @Override
    public boolean contains(int key) {
        IntNode walk=head;
        while(walk!=null){
            if(walk.data==key)
                return true;
            walk=walk.next;
        }
        return false;
    }

    @Override
    public int get(int index) {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public int indexOf(int e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if(head==null)
            return true;
        return false;
    }

    @Override
    public void removeAt(int index) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean remove(int e) {
        IntNode walk=head,prev=null;

        while(walk!=null) {
            if(walk.data==e)
                break;
            prev=walk;
            walk=walk.next;
        }
        if(walk!=null){//if element e exists
            if(walk==head){//remove first element
                head=head.next;
                return true;
            }
            else {
                prev.next=walk.next;
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        int cnt=0;
        IntNode walk=head;
        while(walk!=null) {
            cnt++;
            walk=walk.next;
        }
        return cnt;
    }

}
