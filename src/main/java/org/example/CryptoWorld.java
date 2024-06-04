package org.example;

import java.text.DecimalFormat;

public class CryptoWorld {
    public static void main(String[] args) {

        long currentPopulationOfWorld = 7900000000L; //7.9 billion people
        int currentEngagePopulation = 450000000; //450 million
        double result = 0;
        result = ((double) currentEngagePopulation/currentPopulationOfWorld)*100;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formatterResult = decimalFormat.format(result);
        System.out.println(formatterResult+"% of people currently related to crypto in the world.");

    }
}
