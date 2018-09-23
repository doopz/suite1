/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.doopz.module1;

/**
 *
 * @author doopz
 */
public class ExampleUtilities {

    public static long getCurrentMilliseconds() {
        return System.currentTimeMillis();
    }

    public static long getCurrentSeconds() {
        return System.currentTimeMillis() / 1000;
    }

}
