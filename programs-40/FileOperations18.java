package com.shivangani;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class FileOperations18 {
    public static void main(String args[]) throws IOException {
        //CreatingFile
        CreateFile cr=new CreateFile();
        cr.createFile();

        //Updating File
        UpdateFile up=new UpdateFile();
        up.modifyFile("A:\\Documents//Content.txt", "100", "205");
        System.out.println("done");

//Reading File
       ReadFile rd=new ReadFile();
        List l = rd.readFileInList("A:\\Documents//Content.txt");

        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

       // Deleting File
        DeleteFile del=new DeleteFile();
        del.delete();
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

//READ:
class ReadFile {
    public static List<String> readFileInList(String fileName) {

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
    //UPDATE:

class UpdateFile {

    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
//DELETE:
 class DeleteFile
{
    void delete()
    {
        try
        {
            Files.deleteIfExists(Paths.get("A:\\Documents//Content.txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }

        System.out.println("Deletion successful.");
    }
}
