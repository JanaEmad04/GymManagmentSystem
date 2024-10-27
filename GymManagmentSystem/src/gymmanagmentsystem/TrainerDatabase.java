package gymmanagmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrainerDatabase implements Database<Trainer> {

    private String fileName;
    private ArrayList<Trainer> records;

    public TrainerDatabase(String fileName) {

        this.fileName = fileName + ".txt";
        this.records = new ArrayList<>();
    }

    @Override
    public void readFromFile()//read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
    {
        File f = new File(fileName); //NOTE CreateNewFile idea to handle if in the start the file doesn't exist instead of creating it manually odam el mo3eed
        Scanner s;
        try {
            s = new Scanner(f);
            if(f.createNewFile()) System.out.println("New File Created.");
            ArrayList<String> trainersInfo = new ArrayList<>();
            while (s.hasNextLine()) {
                trainersInfo.add(s.nextLine());
            }
            for (int i = 0; i < trainersInfo.size(); i++) {
                Trainer trainer = createRecordFrom(trainersInfo.get(i));
                insertRecord(trainer);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrainerDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrainerDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Trainer createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String Id = separatedStr[0].trim();
        String name = separatedStr[1].trim();
        String email = separatedStr[2].trim();
        String speciality = separatedStr[3].trim();
        String phoneNumber = separatedStr[4].trim();
        Trainer trainer = new Trainer(Id, name, email, speciality, phoneNumber);
        return trainer;
    }

    @Override
    public ArrayList<Trainer> returnAllRecords() {
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
            {
                return true;
            }
        }
        return false;
        }
    }

    @Override
    public Trainer getRecord(String key) {
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

    public void insertRecord(Trainer record) {
        if (contains(record.getSearchKey())) {
            System.out.println("This Trainer Already Exists.");
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
            System.out.println("This Trainer Does Not Exist.");
        }
    }

    @Override
    public void saveToFile() {
        try {
            FileWriter w = new FileWriter(fileName);

            for (int i = 0; i < records.size(); i++) {
                w.write(records.get(i).lineRepresentation() + "\n");
            }
            w.flush();
            w.close();

        } catch (IOException ex) {
            Logger.getLogger(TrainerDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}
