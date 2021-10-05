/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author fabio
 */

/*    
   Compute your weight on the moon.  
   
   Call this file Moon.java.   
*/    
class Moon {

    public static void main(String args[]) {
        double earthweight; // weight on earth  
        double moonweight; // weight on moon   

        earthweight = 165;

        moonweight = earthweight * 0.17;

        System.out.println(earthweight + " earth-pounds is equivalent to "
                + moonweight + " moon-pounds.");

    }
}

/*  
   This program displays a conversion  
   table of inches to meters. 
 
   Call this program InchToMeterTable.java. 
*/  
class InchToMeterTable {

    public static void main(String args[]) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // convert to meters 
            System.out.println(inches + " inches is "
                    + meters + " meters.");

            counter++;
            // every 12th line, print a blank line        
            if (counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter 
            }
        }
    }
}
