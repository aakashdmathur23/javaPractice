class linkedList {
    Node head;
    private int size;

    linkedList(){
        this.size=0;
    }
    
    class Node {

        String data;
        Node next;
        

        Node(String data){
            this.data = data;
            this.next = null; //at the starting we assume that every element is last element as every element holds its unique identity
            size++; 
            
        }
    }

    //add --> add at first pos 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;   
    }

    //add --> add at last pos
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
    }

    public void printList() {
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }

            System.out.println("NULL");
    }

    public void deleteFirst() {
        if(head == null){        //This is a corner case
            System.out.println("The List is Empty");
            return;
        }
        size--;
        head = head.next; //Single line for delete first
    }

    public void deleteLast() {
        if(head == null){        //This is a corner case
            System.out.println("The List is Empty");
            return;
        }
        size--;
        if(head.next == null){  //jis case mei link list mei ek hi node hoga
            head = null; 
            return;

        }

        Node secondLast = head;
        Node lastNode = head.next;  //head.next = null -> lastNode = null
        while(lastNode.next != null){ //null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
        
    }

    public static void main(String args[]) {

        linkedList list = new linkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();  

        list.addLast("List");
        list.printList(); 

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFirst("This");
        System.out.println(list.getSize());

    }
}
