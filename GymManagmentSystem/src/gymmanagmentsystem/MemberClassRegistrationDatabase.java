
package gymmanagmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class  MemberClassRegistrationDatabase {

    private String fileName;
    private ArrayList<MemberClassRegistration> records;

    public MemberClassRegistrationDatabase(String fileName) {
        this.fileName = fileName+".txt";
        this.records = new ArrayList<>();
    }

    public void readFromFile() throws FileNotFoundException //read men el file w b3den y3mel trainer objects w b3deen y-store fel record list
    {
        File f = new File(fileName);
        Scanner s = new Scanner(f); //NOTE CreateNewFile idea to handle if in the start the file doesn't exist instead of creating it manually odam el mo3eed
        ArrayList<String> MemberClassInfo = new ArrayList<>();

        //Read File
        while (s.hasNextLine()) {
            MemberClassInfo.add(s.nextLine());
        }
        for (int i = 0; i < MemberClassInfo.size(); i++) {
            MemberClassRegistration newMemberRegister = createRecordFrom(MemberClassInfo.get(i));
            insertRecord(newMemberRegister);
        }
        s.close();
    }

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

    public ArrayList<MemberClassRegistration> returnAllRecords() {
        return records;
    }

    public Boolean contains(String key)  //Note that key is formatted memberID,classID
    {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key));
            return false;
        }
        return true;
    }

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

    public void saveToFile() throws IOException {
        FileWriter w = new FileWriter(fileName, true);
        for (int i = 0; i < records.size(); i++) {
            w.write(records.get(i).lineRepresentation() + "\n");
        }
        w.flush();
        w.close();
    }
}

