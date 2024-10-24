package gymmanagmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainerDatabase {
 String fileName;
 ArrayList<Trainer> records;
 
 void readFromFile () throws FileNotFoundException //read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
  {
    File f = new File("fileName");
    Scanner s = new Scanner(f);
    ArrayList<String> trainersInfo = new ArrayList<>();
    while(s.hasNextLine())
    {
        trainersInfo.add(s.nextLine());
    }
    for(int i=0; i<trainersInfo.size(); i++)
    {
       Trainer trainer = createRecordFrom(trainersInfo.get(i));
        insertRecord(trainer);
    }
    
  }

 Trainer createRecordFrom (String line)
   {
       String[] separatedStr = line.split(",");
       String Id = separatedStr[0].trim();
       String name = separatedStr[1].trim();
       String email = separatedStr[2].trim();
       String speciality = separatedStr[3].trim();
       String phoneNumber = separatedStr[4].trim();
       Trainer trainer = new Trainer(Id, name, email, speciality, phoneNumber);
       return trainer;
   }
   ArrayList<Trainer> returnAllRecords ()
   {
       return records;
   }
   Boolean contains (String key)
   {
      for(int i=0; i<records.size(); i++)
       {
           if(records.get(i).getSearchKey().equals(key));
               return false;
       } 
      return true;
   }
   Trainer getRecord (String key)
   {
     int indexRecord = 0;
     boolean flag = false;
     for(int i=0; i<records.size(); i++)
     {
         if(records.get(i).getSearchKey().equals(key))
         {
             indexRecord = i;
             flag = true;
         }
     }
     if(flag) return records.get(indexRecord);
     else return null;
      
   }
   void insertRecord (Trainer record)
   {
     if(contains(record.getSearchKey())) 
      System.out.println("This Trainer Already Exists.");
     else  records.add(record);
   }
   void deleteRecord (String key)
   {
     int indexRecord = 0;
     boolean flag = false;
     for(int i=0; i<records.size(); i++)
     {
         if(records.get(i).getSearchKey().equals(key))
         {
             indexRecord = i;
             flag = true;
         }
     }
     if(flag) records.remove(indexRecord);
     else System.out.println("This Trainer Does Not Exist.");
   }
   void saveToFile () throws IOException
   {
       FileWriter w = new FileWriter(fileName,true);
       for(int i=0; i<records.size(); i++)
       w.write(records.get(i).lineRepresentation()+"\n");
       w.flush();
   }
}
