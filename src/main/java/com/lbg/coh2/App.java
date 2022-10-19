package com.lbg.coh2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
        System.out.println( "Hello World!" );
        int x= System.in.read();
        System.out.println("=>" + x );
        Scanner console = new Scanner(System.in);
        String y=console.next();
        System.out.println("=>" + y );
        
    }
   
}
