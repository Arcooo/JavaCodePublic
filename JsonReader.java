package com.beginsecure.otherclasses;

// import com.fasterxml.jackson.core.exc.StreamReadException;
// import com.fasterxml.jackson.databind.DatabindException;
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import java.io.IOException;
// import java.io.InputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public static void Log(Object o) {
        System.out.print(o);
    }

    public static void main(String[] args) {
        String fileName = "data2.json"; // Replace with your JSON file name

        // Get the path to the current working directory
        String currentDirectory = System.getProperty("user.dir");

        // Construct the full path to the JSON file
        String filePath = currentDirectory + File.separator + fileName;

        try {
            // Open the file using FileReader and BufferedReader
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line as needed (e.g., parse JSON)
                System.out.println(line);
            }

            // Close the resources
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) throws StreamReadException,
    // DatabindException, IOException {

    // InputStream in =
    // Thread.currentThread().getContextClassLoader().getResourceAsStream("data.json");

    // ObjectMapper mapper = new ObjectMapper();
    // JsonNode jsonNode = mapper.readValue(in, JsonNode.class);
    // String jsonString = mapper.writeValueAsString(jsonNode);
    // System.out.println(jsonString);
    // Log(in);

}
