package gymmanagmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassDatabase implements Database<Class>{

    private String fileName;
    private ArrayList<Class> records;

    public ClassDatabase(String fileName) {
        this.fileName = fileName+".txt";
        this.records = new ArrayList<>();
    }

    @Override
    public void readFromFile()  //read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
    {
        try //read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
        {
            File f = new File(fileName );
            Scanner s = new Scanner(f); //NOTE CreateNewFile idea to handle if in the start the file doesn't exist instead of creating it manually odam el mo3eed
            ArrayList<String> classesInfo = new ArrayList<>();
            if(f.createNewFile()) System.out.println("New File Created.");
            //Read File
            while (s.hasNextLine()) {
                classesInfo.add(s.nextLine());
            }
            for (int i = 0; i < classesInfo.size(); i++) {
                Class gymClass = createRecordFrom(classesInfo.get(i));
                insertRecord(gymClass);
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClassDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Class createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String Id = separatedStr[0].trim();
        String name = separatedStr[1].trim();
        String trainerId = separatedStr[2].trim();
        int duration = Integer.parseInt(separatedStr[3].trim()); //Converted to int
        int availableSeats = Integer.parseInt(separatedStr[4].trim()); //Converted to int
        Class newClass = new Class(Id, name, trainerId, duration, availableSeats);
        return newClass;
    }

    @Override
    public ArrayList<Class> returnAllRecords() {
        return records;
    }

    @Override
    public boolean contains(String key) {
        if(records.isEmpty())
            return false;
        else
        {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key))
            return true;
        }
        return false;
        }
    }

    @Override
    public Class getRecord(String key) {
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
            return records.get(indexRecord);
        } else {
            return null;
        }

    }

    public void insertRecord(Class record) {
        if (contains(record.getSearchKey())) {
            System.out.println("This Member Already Exists.");
        } else {
            records.add(record);
        }
    }

    @Override
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
        } else {
            System.out.println("This Member Does Not Exist.");
        }
    }

    @Override
    public void saveToFile() {
        FileWriter w = null;
        try {
            w = new FileWriter(fileName);
            for (int i = 0; i < records.size(); i++) {
                w.write(records.get(i).lineRepresentation() + "\n");
            }           w.flush();
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(ClassDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                w.close();
            } catch (IOException ex) {
                Logger.getLogger(ClassDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
