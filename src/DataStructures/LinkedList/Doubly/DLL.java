package DataStructures.LinkedList.Doubly;


class Node{
    char data;
    Node next;
    Node prev;

    Node(char data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DLL {
    private Node head;

    DLL(){
        head=null;
    }


    void insertAtHead(char val){
        Node n=new Node(val);
        if(head!=null){
            head.prev=n;
        }
        n.next=head;
        head=n;
    }

    void RotateByN(int N){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
        while (N-- >0){
            head=head.next;
            temp=temp.next;
        }
        head.prev=null;
        temp.next=null;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

}






class  DriverCode {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtHead('e');
        dll.insertAtHead('d');
        dll.insertAtHead('c');
        dll.insertAtHead('b');
        dll.insertAtHead('a');
        System.out.println("Before rotation");
        dll.display();
        System.out.println("After rotation");
        dll.RotateByN(3);
        dll.display();

    }
}
