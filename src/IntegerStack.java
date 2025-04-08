package src;

import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack = new Stack<>();



    public void pushElement(int element)
    {
        stack.push(element);
        System.out.println("Pushed: "+element);
    }

    public void popElement()
    {
        if(!stack.isEmpty())
        {
            int popped = stack.pop();
            System.out.println("Popped: "+popped);
        }
        else {
            System.out.println("Stack is empty. Cannot pop");
        }
    }
    public void  isStackEmpty()
    {
        if(stack.isEmpty())
        {
            System.out.println("Yes. The stack is empty");
        }
        else {
            System.out.println("No, the stack is not empty");
        }
    }
    public void displayStack()
    {
        System.out.println("Current Stack: "+stack);
    }

    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack();

        myStack.isStackEmpty();

        myStack.pushElement(10);
        myStack.pushElement(20);
        myStack.pushElement(30);

        myStack.displayStack();
        myStack.popElement();
        myStack.displayStack();
        myStack.isStackEmpty();
    }
}
