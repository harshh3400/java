
public class NewLinkList {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void addMiddle(int idx, int data) {
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void printLinkList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println();
  }

  public int deletefirst() {
    if (size == 0) {
      System.out.print("LinkList is empty!");
      return Integer.MAX_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int deleteLast() {
    if (size == 0) {
      System.out.print("LinkList is empty!");
      return Integer.MAX_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    Node temp = head;
    while (temp.next != tail) {
      temp = temp.next;
    }
    int val = temp.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;
  }

  public int helper(Node head, int key) {
    if (head == null)
      return -1;
    if (head.data == key)
      return 0;
    int idx = helper(head.next, key);
    if (idx == -1)
      return -1;
    return idx + 1;
  }

  public int recursiveSearch(int key) {
    return helper(head, key);
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static Node head;
  public static Node tail;
  int size = 0;

  public static void main(String[] args) {
    NewLinkList li = new NewLinkList();
    li.addLast(10);
    li.addLast(20);
    li.addLast(30);
    li.printLinkList();
    li.reverse();
    li.printLinkList();
  }
}