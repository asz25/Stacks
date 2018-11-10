/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awdsa
 */

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
public class Consumer {
    
    //Will customer buy or return
    boolean buy=false;
    //Which movie, how many tickets
    int movie, tickets;
    Random rand= new Random();
    
    public Consumer()
    {
        buy = rand.nextBoolean();
        movie= rand.nextInt(5)+1;
        tickets = rand.nextInt(5)+1;
    }
    
    public int getMov()
    {
        return movie;
    }
    
    public int getTick()
    {
        return tickets;
    }
    
    public boolean isBuy()
    {
        return buy;
    }
    
    public String toString()
    {
        return "Buy: "+buy+", Movie: "+movie+", Tickets: "+tickets;
    }
    
    public static void main(String args[])
    {
        Consumer test = new Consumer();
        System.out.println(test);
    }
    
}
