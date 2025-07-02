package DataStructures.Stacks;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size){              //this was constructor
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int val){
        if(top==size-1){
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
            return;
        }
        top--;
    }
    int top(){
        if(top==-1){
            System.out.println("underfolow");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
class DriverCode{
    public static void main(String[] args) {
        Stack st = new Stack(25);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(11);
        st.pop();
        System.out.println(st.top());
    }
}