package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Functions {


    public static void emitData(Metrics metrics) {
        Path path = Paths.get("export.txt");
        File file = new File(String.valueOf(path));
        if (file.exists()) {
            System.out.println("TEXT file already exists");
        } else {
            try {
                file.createNewFile();
                System.out.println("TEXT file created!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            
            writer.append("maxhumidity:");
            writer.append(metrics.getMaxhumidity() + "%");
            writer.newLine();

            writer.append("maxtempm:");
            writer.append(metrics.getMaxtempm() + "\u2103");
            writer.newLine();

            writer.append("mintempm:");
            writer.append(metrics.getMintempm() + "\u2103");
            writer.newLine();

            writer.append("precipm:");
            writer.append(metrics.getPrecipim() + "mm");
            writer.newLine();


            writer.close();
            System.out.println("TEXT file written successfully!");
        } catch (Exception e) {
            System.out.println("Error in TEXTFileWriter !!!");
            e.printStackTrace();
        }


    }
}
