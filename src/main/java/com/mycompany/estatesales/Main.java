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
public class Main {
    
    



    // =========================
    // CANDLE CLASS
    // =========================
    static class Candle {

        private String colour;
        private double height;
        protected double price;

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
            price = height * 2.00;
        }

        public double getPrice() {
            return price;
        }
    }

    // =========================
    // SCENTED CANDLE CLASS
    // =========================
    static class ScentedCandle extends Candle {

        private String scent;

        public String getScent() {
            return scent;
        }

        public void setScent(String scent) {
            this.scent = scent;
        }

        @Override
        public void setHeight(double height) {
            super.setHeight(height);
            price = height * 3.00;
        }
    }


    // =========================
    // MAIN
    // =========================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // =====================================================
        // QUESTION 1 - ESTATE SALES
        // =====================================================

        double[][] sales = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
        };

        String[] agents = {"Joe Bloggs", "Jane Doe"};
        String[] months = {"JAN", "FEB", "MAR"};

        double[] totals = new double[2];
        double[] commissions = new double[2];

        System.out.println("ESTATE AGENTS SALES REPORT\n");

        System.out.printf("%-20s", "");

        for (String month : months) {
            System.out.printf("%15s", month);
        }

        System.out.println();

        System.out.println("----------------------------------------------");


        // Display sales
        for (int i = 0; i < sales.length; i++) {

            System.out.printf("%-20s", agents[i]);

            for (int j = 0; j < sales[i].length; j++) {

                System.out.printf("%15.1f", sales[i][j]);

                totals[i] += sales[i][j];
            }

            commissions[i] = totals[i] * 0.02;

            System.out.println();
        }


        // Total sales
        System.out.printf(
                "\nTotal property sales for %s = R %,.0f%n",
                agents[0],
                totals[0]
        );

        System.out.printf(
                "Total property sales for %s = R %,.0f%n",
                agents[1],
                totals[1]
        );


        // Commission
        System.out.printf(
                "\nSales Commission for %s = R %,.0f%n",
                agents[0],
                commissions[0]
        );

        System.out.printf(
                "Sales Commission for %s = R %,.0f%n",
                agents[1],
                commissions[1]
        );


        // Top agent
        int topAgent;

        if (totals[0] > totals[1]) {
            topAgent = 0;
        } else {
            topAgent = 1;
        }

        System.out.println(
                "\nTop performing estate agent: "
                + agents[topAgent]
        );


        // =====================================================
        // QUESTION 2 - CANDLES
        // =====================================================

        System.out.println("\n\n================================");
        System.out.println("QUESTION 02 - CANDLES");
        System.out.println("================================");


        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();


        // =========================
        // REGULAR CANDLE
        // =========================

        System.out.println("\n***************REGULAR CANDLE***************");

        System.out.print("Enter candle colour: ");
        candle.setColour(input.next());

        System.out.print("Enter candle height in inches: ");
        double height = input.nextDouble();

        candle.setHeight(height);


        // =========================
        // SCENTED CANDLE
        // =========================

        System.out.println("\n***************SCENTED CANDLE***************");

        System.out.print("Enter candle colour: ");
        scentedCandle.setColour(input.next());

        System.out.print("Enter candle height in inches: ");
        height = input.nextDouble();

        scentedCandle.setHeight(height);


        // =========================
        // SCENT
        // =========================

        System.out.println("\nAvailable scents:");
        System.out.println("1. Gardenia");
        System.out.println("2. Vanilla");
        System.out.println("3. Lavender");
        System.out.println("4. Cinnamon");

        System.out.print("Enter the scent: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                scentedCandle.setScent("Gardenia");
                break;

            case 2:
                scentedCandle.setScent("Vanilla");
                break;

            case 3:
                scentedCandle.setScent("Lavender");
                break;

            case 4:
                scentedCandle.setScent("Cinnamon");
                break;

            default:
                scentedCandle.setScent("Unknown");
        }


        // =========================
        // DISPLAY CANDLE DETAILS
        // =========================

        System.out.println("\n***************CANDLE DETAILS***************");

        System.out.println("\nRegular Candle");

        System.out.println("Colour: " + candle.getColour());

        System.out.println(
                "Height: " + candle.getHeight() + " inches"
        );

        System.out.printf(
                "Price: R%.2f%n",
                candle.getPrice()
        );


        System.out.println("\nScented Candle");

        System.out.println(
                "Colour: " + scentedCandle.getColour()
        );

        System.out.println(
                "Height: " + scentedCandle.getHeight() + " inches"
        );

        System.out.println(
                "Scent: " + scentedCandle.getScent()
        );

        System.out.printf(
                "Price: R%.2f%n",
                scentedCandle.getPrice()
        );


        input.close();
    }
}
    
    

    

    
    
    

