package com.eip.stack;

public class StackClient {
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push("Java");
        stack.push("Spring");
        stack.push("Spring Data");
        stack.push("Oracle DB");
        stack.print();
        stack.pop();
        System.out.println();
        stack.print();
    }
}