/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author awdsa
 * @param <E>
 */
//This is the Node class, helps implement a Linked List
public class Node<E> {
    //Data
    public E data=null;
    public Node next;
    
    //Contructor
    public Node(E data)
    {
        this.data = data;
        this.next=null;
    }
    
    //Overloaded constructor
    public Node(E data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
