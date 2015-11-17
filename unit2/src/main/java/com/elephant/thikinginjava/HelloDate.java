package com.elephant.thikinginjava;

//: object/HelloDate.java
import java.util.*;

/**The first Thinking in Java examples program.
 * Dispalys a string and today's date.
 * @author elephant
 * @version 1.0
 */
public class HelloDate {
    /**Entrv point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions throw
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello,it's: " );
        System.out.println(new Date());
    }
}/* Output:(55% match)
Hello.it's:
Mon Nov 16 22:07:45 CST 2015
*///
