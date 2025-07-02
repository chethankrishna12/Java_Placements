package DataStructures.Stacks;

public class IsBalance {
    char[] arr;
    int top;
    int size;
    IsBalance(int size){
        this.size = size;
        top = -1;
        arr = new char[size];
    }
    void push(char val){
        if(top == size-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        top--;
    }

    int Top(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
    boolean isBalanced(String exp ){
        Stack st=new Stack(10);
        for (char ch:exp.toCharArray()){
            if (ch=='('){
                st.push(ch);
            } else if(ch==')') {
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        IsBalance obj = new IsBalance(100);
        String expression = "(()";
        System.out.println("Is balanced? " + obj.isBalanced(expression));
    }
}




