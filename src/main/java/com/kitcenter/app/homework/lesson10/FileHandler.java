package com.kitcenter.app.homework.lesson10;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public ArrayList readFile(String relativePathFile) {
        String pathFile = makeFilePath(relativePathFile);

        BufferedReader myFile = null;
        ArrayList<String> fileRows = new ArrayList<String>();

        try {
            myFile = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = myFile.readLine()) != null) {
                fileRows.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                myFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                return fileRows;
            }
        }
    }

    public void writeFile(String relativePathFile, ArrayList newFile) {
        String pathFile = makeFilePath(relativePathFile);
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(pathFile)));
            for (Object row : newFile) {
                writer.append(row + "");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String makeFilePath(String pathFile) {
        File file = new File(System.getProperty("user.dir"), pathFile);
        return file.getAbsolutePath().toString();
    }
}
