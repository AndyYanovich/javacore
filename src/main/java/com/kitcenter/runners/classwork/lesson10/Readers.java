package com.kitcenter.runners.classwork.lesson10;


import java.io.*;

public class Readers {
    public static void main(String[] args) {

        try {
            readTheFile("D:\\input.txt");
        } catch (IOException e) {

        }

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("D:\\input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }

        try {
            String firstLine = "The first line";
            String secondLine = "The second line";
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(

                            new FileOutputStream("D:\\output.txt")));

            writer.append(firstLine);
            writer.newLine();
            writer.append(secondLine);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void readTheFile(String path)
            throws IOException {
        BufferedReader reader = new BufferedReader(

                new FileReader(path));

        String line;
        while ((line = reader.readLine()) != null) {

            System.out.println(line);

        }
        reader.close();
    }
}
