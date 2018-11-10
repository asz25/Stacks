

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awdsa
 */
public class myStack <E> implements stackInterface<E>{

    private E[] theData; //Array for the Stack
    private int topOfStack = -1; //Inidicates the Stack has nothing in it
    private static final int INITIAL_CAPACITY = 10;
    
    //Constructors
    //DEFAULT: Constructs stack using default capacity
    public myStack()
    {
        theData = (E[]) new Object[INITIAL_CAPACITY];
    }
    
    //Overloaded: Create Stack of custom size
    public myStack(int size)
    {
        theData = (E[]) new Object[size];
    }
    
    @Override
    public void push(E obj) {
        
        //Check if stack is full
        if(topOfStack == theData.length-1)
        {
            System.out.println("Stack Overflow..!");
                    return;
        }
        //Else increment topOfStack and add data
        topOfStack++;
        theData[topOfStack] = obj;
       
        
    }

    @Override
    public E pop() {
        //Removes element from the stack if there is any
        if(empty())
        {
            System.out.println("Stack underflow...!");
            return null;
        }
        //There is some element, delete it and return
        return theData[topOfStack--];
        
    }

    @Override
    public E peek() {
        if(empty())
        {
            System.out.println("Stack underflow...!");
            return null;
        }
        return theData[topOfStack];
    }

    @Override
    public boolean empty() {
        return (topOfStack == -1);
    }
    
    public void display(){
        //Method to display the contents of the stack
        System.out.print("Stack: ");
        for(int i=0; i<=topOfStack;i++)
        {
            System.out.print(theData[i]+ " | ");
        }
        System.out.println();
    }
            
    
    
}
