package com.stateanalyser;
import java.io.IOException;
public class IndianStateAnalyser {
    public static void main(String[] args) {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        try {
            csvStateCensus.loadCSVData("C:\\Users\\MOURYA\\IdeaProjects\\Day27_Indian_State_Census_Analyser\\src\\main\\java\\com\\stateanalyser//state_census.csv");
            int numberOfRecords = csvStateCensus.getNumberOfRecords(); // Get the number of records
            System.out.println("Number of records: " + numberOfRecords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

