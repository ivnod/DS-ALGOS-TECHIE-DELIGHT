package org.vinod.day18_14_10_23;

// Pop operation in a linked list

public class Easy {
  public static void main(String[] args) {
    // input keys
    int[] keys = {1, 2, 3, 4};

    // points to the head node of the linked list
    Node head = null;

    // construct a linked list
    for (int i = keys.length - 1; i >= 0; i--) {
      head = new Node(keys[i], head);
    }

    head = pop(head);

    // print remaining linked list
    printList(head);
  }

  private static void printList(Node head) {
    Node ptr = head;
    while (ptr != null) {
      System.out.print(ptr.data + " —> ");
      ptr = ptr.next;
    }
    System.out.println("null");
  }

  private static Node pop(Node head) {
    if (head == null) return null;
    int result = head.data;
    head = head.next;
    System.out.println("popped:: " + result);
    return head;
  }

  public static class Node {
    int data;
    Node next;

    public Node(int key, Node head) {
      this.data = key;
      this.next = head;
    }
  }
}
