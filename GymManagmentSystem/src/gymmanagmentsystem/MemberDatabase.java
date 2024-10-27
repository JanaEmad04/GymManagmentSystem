package gymmanagmentsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemberDatabase implements Database<Member> {

    private String fileName;
    private ArrayList<Member> records;

    public MemberDatabase(String fileName) {
        this.fileName = fileName + ".txt"; //Initialized the ArrayList as it wasn't initialized 
        this.records = new ArrayList<>();
    }

    @Override
    public void readFromFile() {
        File f = new File(fileName);
        try {
            f.createNewFile();
            Scanner s = new Scanner(f);
            ArrayList<String> membersInfo = new ArrayList<>();
            while (s.hasNextLine()) {
                membersInfo.add(s.nextLine());
            }
            for (String memberInfo : membersInfo) {
                Member member = createRecordFrom(memberInfo);
                insertRecord(member);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MemberDatabase.class.getName()).log(Level.SEVERE, "File not found", ex);
        } catch (IOException ex) {
            Logger.getLogger(MemberDatabase.class.getName()).log(Level.SEVERE, "Error creating or reading the file", ex);
        }
    }

    @Override
    public Member createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String Id = separatedStr[0].trim();
        String name = separatedStr[1].trim();
        String membershipType = separatedStr[2].trim();
        String email = separatedStr[3].trim();
        String phoneNumber = separatedStr[4].trim();
        String status = separatedStr[5].trim();
        Member new_member = new Member(Id, name, membershipType, email, phoneNumber, status);
        return new_member;
    }

    @Override
    public ArrayList<Member> returnAllRecords() {
        return records;
    }

    @Override
    public boolean contains(String key) {
        if (records.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).getSearchKey().equals(key)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public Member getRecord(String key) {
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

    public void insertRecord(Member record) {
        if (!contains(record.getSearchKey())) {
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
        }
    }

    @Override
    public void saveToFile() {
        FileWriter w = null;
        try {
            w = new FileWriter(fileName);
            for (int i = 0; i < records.size(); i++) {
                w.write(records.get(i).lineRepresentation() + "\n");
            }
            w.flush();
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(MemberDatabase.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                w.close();
            } catch (IOException ex) {
                Logger.getLogger(MemberDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
//saveToFile w deleteRecord w insertRecord w contains mafish ay 7aga et8ayaret fihom
