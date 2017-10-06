package com.kitcenter.runners.classwork.lesson10;


import java.io.*;

public class Readers {
    public static void main(String[] args) {
        FilePath filePath = new FilePath();

        String url = filePath.getFilePath("input.txt");

        readFile(url);
        writeFile();
        makeFilePath();
    }

    public static void makeFilePath() {
        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "src\\test\\resources\\lesson9\\palindrome.csv";

        File file = new File(currentDir, windowsStyle);
        String url = file.getAbsolutePath().toString();
        System.out.println(file.getAbsolutePath());

        readFile(url);

    }

    public static void readFile(String url) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(url));
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
    }

    public static void writeFile() {
        try {
            String firstLine = "The first line";
            String secondLine = "The second line";
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(

                            new FileOutputStream("D:\\output.txt", true)));

            writer.newLine();
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
