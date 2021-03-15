
import java.io.IOException;
import java.math.BigInteger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LJH
 */
public class testBigInteger {

    public static void main(String[] args) throws IOException
    {
        //Declaration
        int a, b;				
        BigInteger A, B; 
        
        //Initialization:
        a = 54;
        b = 23;
        A  = BigInteger.valueOf(54);
        B  = BigInteger.valueOf(37); 
        
        System.out.println(A);
        System.out.println(B);


    }
}
