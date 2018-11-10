/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author awdsa
 */
public interface arrayListInterface<E> {
    
    public void add(E a); //Method adds element at the end of the list
    
    public void add(E a,int index); //Method adds element at specified index
    
    public E remove(int index); //Removes and returns data at index
    
    public E get(int index); //Returns data at index;
    
    public void set(E a, int index); // Updates data at specific index
    
    public int getSize(); //Returns arraylist size
    
    public int indexOf(E a); //Returns index of specified object
    
    
}
