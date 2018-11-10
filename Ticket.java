
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
public class Ticket {
    
    String name;
    public int price;
    public boolean popcorn;
    Random rand = new Random();
    
    public Ticket(Movie flick)
    {
        this.popcorn = rand.nextBoolean();
        name = flick.name;
        price = flick.price;
    }
    
    public Ticket(Movie flick, boolean pop)
    {
        this.popcorn = pop;
        name = flick.name;
        price = flick.price;
    }
    
    public boolean isFree()
    {
        return popcorn;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return "Ticket for " + name + ", Price: "+price+", Free Popcorn:" + popcorn;
        
    }
    
    
    public static void main(String main[])
    {
        Movie lel = new Movie("Princess Kaguya");
        Ticket test = new Ticket(lel);
        System.out.print(test);
    }
}
