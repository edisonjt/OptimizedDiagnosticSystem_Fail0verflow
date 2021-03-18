/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;

/**
 *
 * @author luist
 */
public class FileManager implements Persistance{

    int allLines;
    int totalWords;

    @Override
    public void save(String fileName, Object src, boolean Option) {

        File file = new File(fileName);
        FileWriter writer;
        BufferedWriter writeLine;

        try {
            if (Option == true) {
                writer = new FileWriter(file, true);
                writeLine = new BufferedWriter(writer);

                Gson gson = new Gson();
                String record;
                record = gson.toJson(src);
                writeLine.write(record + "\n");

                writeLine.close();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    
    @Override
    public String find(String fileName, String word) {

        File file = new File(fileName);
        String results = "";

        try {
            if (file.exists()) {
                BufferedReader readFile = new BufferedReader(new FileReader(file));
                String readedLine;

                while ((readedLine = readFile.readLine()) != null) {
                    allLines = allLines + 1;
                    String[] words = readedLine.split(",");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(word)) {
                            totalWords = totalWords + 1;
                            results = readedLine;

                        }
                    }
                }

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return results;

    }
    
    @Override
    public void reader(String fileName, Object src) {

        File file = new File(fileName);
        FileReader reader;
        BufferedReader readerLine;

        try {
            reader = new FileReader(file);
            readerLine = new BufferedReader(reader);
            while (readerLine.ready()) {

                Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
                String line;
                line = readerLine.readLine();
                line = prettyGson.toJson(src);

                System.out.println("======================0=========================");
                System.out.println("");
                System.out.println(line);
                System.out.println("");
                System.out.println("======================0=========================");

            }
            readerLine.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
