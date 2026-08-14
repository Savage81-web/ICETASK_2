/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatesales;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class DemoCandles {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Create objects
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        
        
        
        
       // ---------------- REGULAR CANDLE ----------------
        System.out.println("***************REGULAR CANDLE***************");

        System.out.print("Enter candle colour: ");
        String colour = input.nextLine();
        candle.setColour(colour);

        System.out.print("Enter candle height in inches: ");
        double height = input.nextDouble();
        candle.setHeight(height);

        input.nextLine(); // Clear newline
        
        
        // ---------------- SCENTED CANDLE ----------------
        System.out.println("\n***************SCENTED CANDLE***************");

        System.out.print("Enter candle colour: ");
        colour = input.nextLine();
        scentedCandle.setColour(colour);

        System.out.print("Enter candle height in inches: ");
        height = input.nextDouble();
        scentedCandle.setHeight(height);


        
    }
    
    
    
     
        
        
        
        
        
        
    
}
