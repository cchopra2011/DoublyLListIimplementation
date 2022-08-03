public class DLLDriver {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        // dll.addFirst(3);
        // dll.addFirst(2);
        // dll.addFirst(8);
        // dll.addFirst(17);

        // dll.displayforwdReverse(); 

        // dll.addLast(3);
        // dll.addLast(2);
        // dll.addLast(8);
        // dll.addLast(17);

        // dll.displayforwdReverse();
        
        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(8);
        dll.addLast(17);
        dll.addAtIndex(19,3);

        dll.addAfterNode(8, 97);

        dll.displayforwdReverse();



    }
}
