
package gymmanagmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class  MemberClassRegistrationDatabase implements Database<MemberClassRegistration> {

    private String fileName;
    private ArrayList<MemberClassRegistration> records;

    public MemberClassRegistrationDatabase(String fileName) {
        this.fileName = fileName+".txt";
        this.records = new ArrayList<>();
    }

    @Override
    public void readFromFile() //read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
    {File f = new File(fileName);
        try //read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
        {
            if(f.createNewFile()) 
                System.out.println("New File Created.");
            //Read File
             Scanner s = new Scanner(f); //NOTE CreateNewFile idea to handle if in the start the file doesn't exist instead of creating it manually odam el mo3eed
            ArrayList<String> MemberClassInfo = new ArrayList<>();
           
            while (s.hasNextLine()) {
                MemberClassInfo.add(s.nextLine());
            }
            for (int i = 0; i < MemberClassInfo.size(); i++) {
                MemberClassRegistration newMemberRegister = createRecordFrom(MemberClassInfo.get(i));
                insertRecord(newMemberRegister);
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MemberClassRegistrationDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MemberClassRegistrationDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String memeberId = separatedStr[0];
        String classId = separatedStr[1];
        String status = separatedStr[2];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Parse the date part to LocalDate
        LocalDate registrationDate = LocalDate.parse(separatedStr[3], formatter);
        MemberClassRegistration newMemberRegister = new MemberClassRegistration(memeberId, classId, status, registrationDate);
        return newMemberRegister;
    }

    @Override
    public ArrayList<MemberClassRegistration> returnAllRecords() {
        return records;
    }

    @Override
    public boolean contains(String key)  //Note that key is formatted memberID,classID
    {
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
    public MemberClassRegistration getRecord(String key) {
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

    public void insertRecord(MemberClassRegistration record) {
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
            System.out.println("This Member isn't Registered in that class.");
        }
    }

    @Override
    public void saveToFile() {
        FileWriter w = null;
        try {
            w = new FileWriter(fileName);
            for (int i = 0; i < records.size(); i++) {
                w.write(records.get(i).lineRepresentation() + "\n");
            }   w.flush();
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(MemberClassRegistrationDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                w.close();
            } catch (IOException ex) {
                Logger.getLogger(MemberClassRegistrationDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

