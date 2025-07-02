package DataStructures;



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLL {

    private Node head;


    StackLL() {
        head = null;
    }


    void push(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + head.data);
        head = head.next;
    }


    int top() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.data;
    }


    boolean isEmpty() {
        return head == null;
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class DriverCode {
public static void main(String[] args) {
    StackLL st = new StackLL();
    st.push(10);
    st.push(20);
    st.push(30);
    st.display();
    System.out.println("Top of Stack " + st.top());
    st.pop();
    st.display();
    System.out.println("Stack is empty " + st.isEmpty());
}
}
