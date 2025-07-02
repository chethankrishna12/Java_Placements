package DataStructures.Queues;

public class Queue {
    int[] arr;
    int front,back;
    int size;

    Queue(int N){
        size=N;
        front=back=-1;
        arr=new int[size];
    }

    void push(int x){
        if(back==size-1){
            System.out.println("Overflow");
            return;
        }
        back++;
        arr[back]=x;
    }

    void pop(){
        if(front==-1||front>back){
            System.out.println("Underflow");
        }
        front++;
    }
    int peek(){
        if(front==-1||front>back){
            System.out.println("Underflow");
        }
        return arr[back];
    }

    boolean isEmpty(){
        return front == -1 || front > back;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.push(25);
        q.push(82);
        q.push(50);
        q.push(25);
    }
}
