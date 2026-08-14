/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estatesales;

/**
 *
 * @author emeris
 */
public class EstateSales {

    public static void main(String[] args) {
        // 2D array: rows = estate agents, columns = Jan, Feb, Mar
        double[][] sales = {
            {800000, 1500000, 2000000},  // Joe Bloggs
            {700000, 1200000, 1600000}   // Jane Doe
        };

        String[] agents = {"Joe Bloggs", "Jane Doe"};
        String[] months = {"JAN", "FEB", "MAR"};

        double[] totals = new double[2];
        double[] commissions = new double[2];

        System.out.println("ESTATE AGENTS SALES REPORT\n");
        
        
        // Print headings
        System.out.printf("%-15s", "");
        for (String month : months) {
            System.out.printf("%15s", month);
        }
        System.out.println();

        System.out.println("----------------------------------------------");
        
        // Display sales and calculate totals
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-15s", agents[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%15.1f", sales[i][j]);
                totals[i] += sales[i][j];
            }
            
            // Calculate 2% commission
            commissions[i] = totals[i] * 0.02;
            System.out.println();
        }
        
        // Print totals
        System.out.printf("\nTotal property sales for %s = R %,.0f%n",
                agents[0], totals[0]);

        System.out.printf("Total property sales for %s = R %,.0f%n",
                agents[1], totals[1]);

        // Print commissions
        System.out.printf("%nSales Commission for %s = R %,.0f%n",
                agents[0], commissions[0]);

        System.out.printf("Sales Commission for %s = R %,.0f%n",
                agents[1], commissions[1]);
        
        // Determine top-selling agent
        int topAgent;

        if (totals[0] > totals[1]) {
            topAgent = 0;
        } else {
            topAgent = 1;
        }

        System.out.println("\nTop performing estate agent: "
                + agents[topAgent]);

        
        
        


    }
}
