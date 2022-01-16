package com.Shivangani;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileAppend {
public static void main(String[] args) throws IOException {
 CreateFile create=new CreateFile();
 create.createFile();
  ReadFile rd=new ReadFile();
  rd.readFile("A:\\Documents//Content.txt");
  Write wr=new Write();
  wr.write();
    Append app=new Append();
    app.append();
}
}


class CreateFile{
    void createFile() throws IOException
    {
        File file = new File("A:\\Documents//Content.txt");

        //Create the file
        if (file.createNewFile()){
            System.out.println("File is created!");
        }else{
            System.out.println("File already exists.");
        }

        //Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("This is the data in th content.txt File");
        writer.close();
    }
}


class ReadFile {
    public static List<String> readFile(String fileName) {

        List<String> lines = Collections.emptyList();

        try {
            lines =
                    Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}

class Write {
    void write()

    {
        try {
            FileWriter fw = new FileWriter("A:\\Documents//Content.txt");
            fw.write("Writing new content in the file");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}


class Append{
    void append(){

        try {
            String data = "Append the data";
            File f1 = new File("A:\\Documents//Content.txt");
            if(!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();
            System.out.println("Appended the file");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
