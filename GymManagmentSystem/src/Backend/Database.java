
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Database<ReturnType extends MainInterface> {
    protected String fileName;
    protected ArrayList<ReturnType> records;

    public Database(String fileName) {

        this.fileName = fileName + ".txt";
        this.records = new ArrayList<>();
    }

        public void readFromFile()//read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
    {
        File f = new File(fileName); //NOTE CreateNewFile idea to handle if in the start the file doesn't exist instead of creating it manually odam el mo3eed
        Scanner s;
        try {
            
            if(f.createNewFile())
            {
                System.out.println("File Created !");
            }
            else
            {
                System.out.println("File Already Exists !");
            ArrayList<String> objectInfo = new ArrayList<>();
            s = new Scanner(f);
            while (s.hasNextLine()) {
                objectInfo.add(s.nextLine());
            }
            for (int i = 0; i < objectInfo.size(); i++) {
                ReturnType myObj = createRecordFrom(objectInfo.get(i));
                insertRecord(myObj);
            }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error. File Not Found");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }


   public abstract ReturnType createRecordFrom(String line);
   
    public ArrayList<ReturnType> returnAllRecords() {
        return (ArrayList<ReturnType>) records;
    }

    
    public boolean contains(String key) {
        if(records.isEmpty())
            return false;
        else
        {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key))
            {
                return true;
            }
        }
        return false;
        }
    }

    public ReturnType getRecord(String key) {
        int indexRecord = 0;
        boolean flag = false;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                indexRecord = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            return (ReturnType) records.get(indexRecord);
        } else {
            return null;
        }

    }

    public void insertRecord(ReturnType record) {
        if (!contains(record.getSearchKey())) {
           records.add((ReturnType) record);
        } 
    }

  
    public void deleteRecord(String key) {
        int indexRecord = 0;
        boolean flag = false;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                indexRecord = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            records.remove(indexRecord);
        } 
        
    }

   
    public void saveToFile() {
        try {
            FileWriter w = new FileWriter(fileName,true);

            for (int i = 0; i < records.size(); i++) {
                w.write(records.get(i).lineRepresentation() + "\n");
            }
            w.flush();
            w.close();

        } catch (IOException ex) {
            System.out.println("Error.");
        }

    }
 
}
