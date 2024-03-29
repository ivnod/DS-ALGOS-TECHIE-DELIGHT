package org.vinod.october.day3.beginner;

// Implement stack in Java
public class Beginner {
  public static void main(String[] args) {
    Stack stack = new Stack(3);

    stack.push(1); // inserting 1 in the stack
    stack.push(2); // inserting 2 in the stack

    stack.pop(); // removing the top element (2)
    stack.pop(); // removing the top element (1)

    stack.push(3); // inserting 3 in the stack

    System.out.println("The top element is " + stack.peek());
    System.out.println("The stack size is " + stack.size());

    stack.pop(); // removing the top element (3)

    // check if the stack is empty
    if (stack.isEmpty()) {
      System.out.println("The stack is empty");
    } else {
      System.out.println("The stack is not empty");
    }
  }
}

class Stack {

  private int arr[];
  private int capacity;
  private int top;

  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack is full");
      return;
    }
    System.out.println("Inserting " + x);
    top++;
    arr[top] = x;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return Integer.MIN_VALUE;
    }
    System.out.println("Removing " + peek());
    return arr[top--];
  }

  public int size() {
    return top + 1;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return Integer.MIN_VALUE;
    }
    return arr[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == capacity - 1;
  }
}
