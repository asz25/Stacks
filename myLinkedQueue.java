/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * GOT THIS FROM: https://www.geeksforgeeks.org/queue-set-2-linked-list-implementation/
 * @param <E>
 */
public class myLinkedQueue<E> {
    
    public Node front, rear;
      
    public myLinkedQueue() {
        this.front = this.rear = null;
    }
      
    // Method to add an key to the queue.  
    public void enqueue(E key)
    {
         
        // Create a new LL node
        Node temp = new Node(key);
      
        // If queue is empty, then new node is front and rear both
        if (this.rear == null)
        {
           this.front = this.rear = temp;
           return;
        }
      
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
      
    // Method to remove an key from queue.  
    public Node dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
           return null;
      
        // Store previous front and move front one node ahead
        Node temp = this.front;
        this.front = this.front.next;
      
        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
           this.rear = null;
        return temp;
    }
    
    public void printQueue() {
    Node n = front;
    System.out.println("The contents in the Queue are: ");
    while (n != null) {
        System.out.print(n.data + " | ");
        n = n.next;
    }
    System.out.println("");
}
    
   
}
