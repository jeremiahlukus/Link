/**
 * Created by Jeremiah on 9/16/16.
 *
public class Node {
        int data;
        Node next;

        Node(){

        }
        Node(int data){
            this.data = data;
            next = null;
        }
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }


    }

class MyLInkedList{
    Node head;

    public void add(int num) {

        if (head == null) {
            head = new Node(num);
        }
        else{
            Node temp = new Node(num);
            Node current = head;
            if (current != null) {
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(temp);
            }

        }

    }
    public void print(){
        Node current = head;
        if (current != null) {
            while (current != null) {
                System.out.println(current.getData());
                current = current.getNext();
            }
        }
    }




}


class MyLInkedListTester{
    public static void main(String args[]){
        MyLInkedList llist = new MyLInkedList();

        // add more elements to LinkedList
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);


        llist.print();
    }
}


*/
