package com.lbg.coh2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	 App app= new App();
    	 String lineRead="x";
    	 Scanner console = new Scanner(System.in);
    	 ArrayList<Double> lines = new ArrayList<Double>();    	
    	 System.out.println( "Enter the VAT percentage  :" );
         float vat =console.nextFloat();
        try
        {
            while(prompt() &&(lineRead = console.next()) != null) 
            {
                if (lineRead.toString().equalsIgnoreCase("QUIT"))
                	break;

            	lines.add(app.VAT(Float.parseFloat(lineRead),vat));
            }
            
        }catch( NoSuchElementException e )
        {}
        
        Collections.sort(lines);
        Collections.reverse(lines);
        for (double line : lines) {
        System.out.println(line);
        }
        
        
    }

    
   double VAT (float cost, float vat) {

//     //return ((((vat)/100)*cost) + cost);
    return ((vat*cost)/100 + cost)	;	
    }
   static private boolean prompt()
   {
       System.out.print("enter a message :");
       return true;
   }
}
