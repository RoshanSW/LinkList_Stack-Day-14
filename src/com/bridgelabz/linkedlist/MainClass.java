package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class MainClass
{
        public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type three integer");
        int x1 = input.nextInt(), x2=input.nextInt(), x3=input.nextInt();
        LinkedList list = new LinkedList();
        list.add(x1);
        list.add(x2);
        list.add(x3);
        list.display();
    }
}
