/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafizzbuzz;

/**
 *
 * @author ivan
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int n)
    {
        String resultado= String.valueOf(n);         
        if (n%3==0) 
        {
            resultado = "Fizz";
        }       
        if (n%5==0) 
        {
            resultado = "Buzz";
        }
        return resultado;
       
    }
    
}
