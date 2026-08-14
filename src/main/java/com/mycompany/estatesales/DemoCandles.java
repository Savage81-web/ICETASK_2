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
        
        
         // Scent options
        System.out.println("\nAvailable scents:");
        System.out.println("1. Gardenia");
        System.out.println("2. Vanilla");
        System.out.println("3. Lavender");
        System.out.println("4. Cinnamon");

        System.out.print("Enter the scent: ");
        int scentChoice = input.nextInt();

        String scent;
        
        switch (scentChoice) {
            case 1:
                scent = "Gardenia";
                break;

            case 2:
                scent = "Vanilla";
                break;

            case 3:
                scent = "Lavender";
                break;

            case 4:
                scent = "Cinnamon";
                break;

            default:
                scent = "Unknown";
        }

        scentedCandle.setScent(scent);
        
        
        // ---------------- DISPLAY DETAILS ----------------
        System.out.println("\n***************CANDLE DETAILS***************");

        System.out.println("\n***************Regular Candle***************");
        System.out.println("Colour: " + candle.getColour());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.printf("Price: R%.2f%n", candle.getPrice());

        System.out.println("\n***************Scented Candle***************");
        System.out.println("Colour: " + scentedCandle.getColour());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.printf("Price: R%.2f%n", scentedCandle.getPrice());

        input.close();



        
    }
    
    
    
     
        
        
        
        
        
        
    
}
