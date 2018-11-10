
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awdsa
 */
public class Movie {
    
    String name;
    int capacity,price;
    Random rand = new Random();
    
    public Movie(String movie)
    {
        name = movie;
        capacity = rand.nextInt(5)+2;
        price = rand.nextInt(11)+10;
    }
    
    public Movie(String movie, int cap)
    {
        name = movie;
        capacity = cap;
        price = rand.nextInt(11)+10;
    }
    
    //Increments capacity by given value
    public void inc(int n)
    {
        capacity+=n;
    }
    
    //Decrements capacity by given value
    public void dec(int n)
    {
        capacity-=n;
    }
    
    public int getCap()
    {
        return capacity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String result="";
        result+= "Movie: "+name+", Price: "+price+", Capacity: "+capacity;
        return result;
    }
    
    public static void main(String args[])
    {
        Movie test = new Movie("Princess Kaguya");
        System.out.println(test);
    }
    
}
