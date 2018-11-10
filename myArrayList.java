/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author awdsa
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class myArrayList<E> implements arrayListInterface<E>{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  }
    
    private int size; //Number of elements in array
    private int capacity; // How many elements can be stored in arrayList
    private E[] myArray; //Array reference to the actual data
    private static final int INITIAL_CAPACITY = 10; //Default capacity of arraylist
    
    //CONSTRUCTORS
    public myArrayList()
    {
        this.capacity = INITIAL_CAPACITY;
        this.size=0;
        myArray = (E[])new Object[this.capacity];
        
    }
    
    public myArrayList(int capacity)
    {
        this.capacity = capacity;
        this.size=0;
        myArray = (E[])new Object[this.capacity];
    }
    
    @Override
    public void add(E a) {
        if(size<capacity) //If there is space
        {
            myArray[size] = a; //Data inserted
            size++;            //Size updated
        }
        else
        {
            System.out.println("Not enough space to add element");
            System.out.println("Calling reallocate() method");
            this.reallocate(); //Doubles arralist capacity
            this.add(a); //Adding of element can now be done
        }
    }

    @Override
    public void add(E a, int index) {
       //This add method adds teh data at specfied index
       //Check if index is valid
       if(index<0 || index > size)
       {
            System.out.print("Invalid index");
            return;
       }
       
       else if(index==size)
           //This means we are inserting at the end of the list, reuse previous add() method
           add(a);
       
       else
       {
           //We have to shift elements in the list ufrther back. Check for space
           if(capacity==size)
               reallocate();
           //Move the data and insert
           for(int i = size; i>index; i--)
           {
               myArray[i] = myArray[i-1];
           }
           
           //Once shifting is done, insert data at index and update size
           myArray[index] = a;
           size++;
               
       }
    }
    
    public String toString()
    {
        String S = "Contents of the ArrayList: ";
        //Populate string S with data elements of the list
        //Iterate over the list and add the elements to S
        for(int i=0;i<size;i++)
        {
            S+= myArray[i] +", ";
        }
    
        return S;
    }

    @Override
    public E remove(int index) {
        //This method deletes and return the deleted value at index
        //Check if index is valid
        if(index<0 || index>=size)
        {
            System.out.println("Index is invalid");
            return null;
        }
            
        //Restore the deleted data in a variable so it can be returned
        E temp = myArray[index];
        //Use loop to shift elements one place to the left
        for(int i =index;i<size;i++)
        {
            myArray[i] = myArray[i+1];
        }
        size--;                 //Update size
        return temp;            //Return temp
        
    }

    //Returns element at given index
    @Override
    public E get(int index) {
        //Check if index is valid
        if(index<0 || index>=size)
        {
            System.out.println("Index is invalid, cannot get data");
            return null;
        }
            
        else
            return myArray[index];
    }

    @Override
    public void set(E a, int index) {
        //Returns the value at specified index
        //Must check if index is valid
        if(index<0 || index>=size)
        {
            System.out.println("Index is invalid, cannot update data");
        }
        else
            myArray[index] = a;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int indexOf(E a) {
        
        for(int i=0;i<size;i++)
        {
            //Checks if current index has seeked value, if so stops loop
            if(myArray[i].equals(a))
                return i;
        }
        return -1;
    }

    private void reallocate() {
        
        //Create bigger capacity array
        this.capacity *=2;
        E[] temp = (E[]) new Object[this.capacity];
        
        //Copying elements to new bigger array
        for(int i =0; i<myArray.length;i++)
        {
            temp[i] = myArray[i];
        }
        
        //Copying is done so new data array is assigned
        this.myArray = temp;
    }
    
    
    
}
