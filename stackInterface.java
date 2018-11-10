

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awdsa
 */
public interface stackInterface <E> {
    //The different methds for stack
    
    void push(E obj);
    
    E pop();
    E peek();
    boolean empty();
    
}
