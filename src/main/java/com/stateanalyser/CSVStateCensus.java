package com.stateanalyser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CSVStateCensus {
    private List<String[]> data;
    private int numberOfRecords;

    public void loadCSVData(String filePath) throws IOException {
        data = new ArrayList<>(); // Create a new list to store data
        BufferedReader reader = new BufferedReader(new FileReader(filePath)); // Open the file for reading
        String line;
        while ((line = reader.readLine()) != null) { // Read each line of the file
            String[] record = line.split(","); // Split the line into an array of values
            data.add(record); // Add the record to the list
        }
        reader.close(); // Close the file
        numberOfRecords = data.size(); // Set the number of records
    }

    public int getNumberOfRecords() {
        return numberOfRecords; // Return the number of records
    }

    public Iterator<String[]> getIterator() {
        return data.iterator(); // Return an iterator over the data
    }
}

