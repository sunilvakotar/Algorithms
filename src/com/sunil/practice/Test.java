import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head == null){
            head = new SinglyLinkedListNode(data);
            return head;
        }
        SinglyLinkedListNode node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = new SinglyLinkedListNode(data);
        return head;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        int count = 1;
        SinglyLinkedListNode node = head;
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);

        if(position == 0){
            insertNode.next = head;
            return insertNode;
        }else{
            while(node != null){
                if(count == position){
                    insertNode.next = node.next;
                    node.next = insertNode;
                    break;
                }else{
                    node = node.next;
                }
            }
            return head;
        }




    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head.next != null){
            SinglyLinkedListNode node = reverse(head.next);
            SinglyLinkedListNode tempNode = node;
            head.next = null;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = head;
            return node;
        }else{
            return head;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = 3;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {

            int llistItem = 10+i;
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
            llist.head = llist_head;

        }
        reverse(llist.head);
        SinglyLinkedListNode hh = insertNodeAtPosition(llist.head, 12, 1);
        System.out.println(llist.head);
        //printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
    }
}
