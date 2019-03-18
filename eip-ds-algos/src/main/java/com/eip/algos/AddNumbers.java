package com.eip.algos;

import com.eip.linkedList.LinkedList;
import com.eip.linkedList.LinkedListNode;

public class AddNumbers {

    public LinkedList addTwoNumbers(LinkedList numList1, LinkedList numList2) {

        if (numList1 == null) {
            return numList2;
        }
        if (numList2 == null) {
            return numList1;
        }

        LinkedListNode head1 = numList1.head;
        LinkedListNode head2 = numList2.head;
        LinkedList result = new LinkedList();
        int sum = 0;
        int remainder = 0;
        int quotient = 0;
        while (head1.getNext() != null && head2.getNext() != null) {
            int currSum = Integer.parseInt(head1.getData()) + Integer.parseInt(head2.getData());
            quotient = currSum / 10;
            if (currSum < 10) {
                result.addNodeAtEnd(String.valueOf(currSum));
            } else if(currSum >= 10) {
                if (currSum % 10 != 0) {
                    remainder = currSum % 10;
                } 
            }
            

        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(2 / 10);
    }

}