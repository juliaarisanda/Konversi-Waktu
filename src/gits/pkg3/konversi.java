/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits.pkg3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ZULIA ARISANDA
 */
public class konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date jam = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss a");
        SimpleDateFormat fs = new SimpleDateFormat ("HH:mm:ss");   
        
        System.out.println("Waktu : " +ft.format(jam)+ " => " +"Waktu : " + fs.format(jam));
        //System.out.println("Waktu : " +ft.format(jam));
    }
    
}
