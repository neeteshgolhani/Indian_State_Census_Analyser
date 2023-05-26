package com.stateanalyser;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateCensusAnalyserTest {
    @Test
    public void testNumberOfRecordsMatch() throws IOException {
        CSVStateCensus csvStateCensus = new CSVStateCensus();
        csvStateCensus.loadCSVData("C:\\Users\\MOURYA\\IdeaProjects\\Day27_Indian_State_Census_Analyser\\src\\main\\java\\com\\stateanalyser\\state_census.csv"); // Load CSV data
        int numberOfRecords = csvStateCensus.getNumberOfRecords(); // Get the number of records

        int expectedNumberOfRecords = 11; // Set the expected number of records

        Assert.assertEquals(expectedNumberOfRecords, numberOfRecords);
    }
}
