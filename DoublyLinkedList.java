
public class DoublyLinkedList{

    private Node head; //null, by default reference variable of an Object points to null

    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node; /*need to keep in mind, for the first node head -> null and may give null pointer */
        }
        head = node;
    }

    public void addLast(int val){
        Node node = new Node(val);
        if(head==null){
         node.prev = null;
         head = node;
         node.next = null;   
         return;
        }

        Node dummyTail = head;
        while(dummyTail.next!=null){
            dummyTail = dummyTail.next;
        }
        node.next = null;
        dummyTail.next = node;
        node.prev = dummyTail;
    }

    public void addAtIndex(int val,int addAtIndex){
        if(addAtIndex == 0){
            addFirst(val);
            return;
        }

        if(addAtIndex == 4){
            addLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<addAtIndex;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next,temp);
        temp.next = node;
        node.next.prev = node;
    }

    public void addAfterNode(int after,int val){
        Node prevNode = find(after);

        if(prevNode == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = prevNode.next;
        prevNode.next = node;
        node.prev =  prevNode;
        if(node.next!=null){
            node.next.prev = node;
        }
    }


    private DoublyLinkedList.Node find(int val) {
        Node node = head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void displayforwdReverse(){ /* we need tail , but for this we can reference last Node */
        Node temp = head;
        Node last = null; /* so that after fowrd iteration last points to the tail  */

        System.out.println("Printing in Frwd");
        while(temp!=null){
            last = temp;
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");

        System.out.println("Printing in Reverse");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("null");


    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev; 
        }
    }
}