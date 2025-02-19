
package Linked_List;

public class Add_first_linked {

    //node class creation
    public class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //make head and tail static
    public static Node head;
    public static Node tail;

//fucntion for add new node
    public void addfirst(int data) {
        Node newnode = new Node(data);  //1.create new node
        newnode.next = head; // 2.link
        head = newnode; // 3.head ki value newnode ko refer krdo

    }
  // Display linked list
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Add_first_linked obj = new Add_first_linked();
        obj.addfirst(20);
        obj.addfirst(30);
        display(); //callind method to show list

    }
}
