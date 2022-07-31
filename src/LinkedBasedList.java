import java.util.LinkedList;

public class LinkedBasedList implements IntList {

    private IntNode head = null;


    //Appends the specified element to the end of this list.
    @Override
    public boolean add(int e) {
        if (head == null) {
            head = new IntNode(e);
            return true;
        } else {
            IntNode walk = head;
            while (walk != null) {
                if (walk.next == null)//if walk refers to the last node
                    break;
                walk = walk.next;
            }
            walk.next = new IntNode(e);
        }
        return false;
    }

    public void printList() {
        IntNode walk = head;
        System.out.print("\nList:");
        while (walk != null) {
            System.out.print(walk.data + "->");
            walk = walk.next;
        }
        System.out.println("null");
    }

    public LinkedBasedList divideMid() {

       LinkedBasedList sublist = new LinkedBasedList();

        if (head == null)
           return sublist;

        IntNode walker = head, mainHead = head, current = null;

        int size = size();

        if (size % 2 == 0) {
            for (int i = 1; i < size / 2; i++) {
                if (walker == null) {
                    break;
                }
                walker = walker.next;
                current = walker.next;
            }
            walker.next = null;

        } else {
            for (int i = 1; i < (size / 2) + 1; i++) {
                if (walker == null) {
                    break;
                }
                walker = walker.next;
                current = walker.next;
            }

            walker.next = null;
        }

        while (current != null){
            sublist.add(current.data);
            current = current.next;
        }

        return sublist;
    }

    public LinkedBasedList add(LinkedBasedList l1, LinkedBasedList l2) {

        IntNode _head1 = l1.head, _head2 = l2.head;

        int temp = 0, carry = 0;

        LinkedBasedList sum = new LinkedBasedList();

        while (_head1 != null || _head2 != null) {
            if (_head1 != null) {
                temp = _head1.data;
                _head1 = _head1.next;
            }
            if (_head2 != null) {
                temp = temp + _head2.data;
                _head2 = _head2.next;
            }

            if (temp > 9) {
                sum.add(temp % 10);
                carry = temp / 10;


            } else if (temp <= 9) {
                temp = carry + temp;
                if(temp > 9){
                    sum.add(temp % 10);
                    carry = temp / 10;
                }else {
                    sum.add(temp);
                    carry = 0;
                }
            }
            temp = 0;
        }

        if (carry != 0) {
            sum.add(carry);
        }
        sum.printList();
        return sum;
    }

    public void dupPositives() {

        IntNode runner = head;
        IntNode node;

        if (runner == null) {
            return;
        }

        while (runner != null) {
            if (runner.data < 0) {
                runner = runner.next;
            } else {
                node = new IntNode(runner.data);
                node.next = runner.next;
                runner.next = node;
                runner = node.next;

            }
        }
    }

    @Override
    public void add(int index, int element) {
        if (index <= size() && index >= 0) {
            IntNode newNode = new IntNode(element);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                int cnt = 0;
                IntNode walk = head, prev = null;
                while (walk != null) {
                    cnt++;
                    prev = walk;
                    walk = walk.next;
                    if (cnt == index)
                        break;
                }
                newNode.next = walk;
                prev.next = newNode;

            }
        }

    }

    @Override
    public void clear() {
        head = null;

    }

    @Override
    public boolean contains(int key) {
        IntNode walk = head;
        while (walk != null) {
            if (walk.data == key)
                return true;
            walk = walk.next;
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
        return head == null;
    }

    @Override
    public void removeAt(int index) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean remove(int e) {
        IntNode walk = head, prev = null;

        while (walk != null) {
            if (walk.data == e)
                break;
            prev = walk;
            walk = walk.next;
        }
        if (walk != null) {//if element e exists
            if (walk == head) {//remove first element
                head = head.next;
                return true;
            } else {
                prev.next = walk.next;
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        int cnt = 0;
        IntNode walk = head;
        while (walk != null) {
            cnt++;
            walk = walk.next;
        }
        return cnt;
    }

}
