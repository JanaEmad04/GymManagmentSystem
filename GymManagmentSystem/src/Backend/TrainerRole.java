package Backend;

import Constants.FileNames;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class TrainerRole implements FileNames{

    public MemberDatabase memberDatabase = new MemberDatabase(FileNames.MEMBER_FILENAME);
    public ClassDatabase classDatabase = new ClassDatabase(FileNames.CLASS_FILENAME);
    public MemberClassRegistrationDatabase registrationDatabase = new MemberClassRegistrationDatabase(FileNames.REGISTRATION_FILENAME);
    // public static final String STATUS = "active";

    public TrainerRole() {
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }

    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        boolean flag = true;
        for (int i = 0; i < memberDatabase.returnAllRecords().size(); i++) {
            if ((memberDatabase.contains(memberID))) {
                flag = false;
                break;
            }
        }

        if (flag) {
            Member record = new Member(memberID, name, membershipType, email, phoneNumber, status);
            memberDatabase.insertRecord(record);
            //insertRecord will check if member already exists
        }

    }

    public ArrayList<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        boolean flag = true;
        for (int i = 0; i < classDatabase.returnAllRecords().size(); i++) {
            if ((classDatabase.contains(classID))) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            Class new_class = new Class(classID, className, trainerID, duration, maxParticipants);
            classDatabase.insertRecord(new_class);
        }

    }

    public ArrayList<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }
    
    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        if (memberDatabase.contains(memberID) && classDatabase.contains(classID)) {
            Class classToRegister = classDatabase.getRecord(classID);
            if (classToRegister.getAvailableSeats() > 0 && !registrationDatabase.contains(memberID+","+classID)) //If there are avaliable seats
            {      
                    classToRegister.setAvailableSeats((classToRegister.getAvailableSeats()) - 1);
                    String status = "active";
                    MemberClassRegistration record = new MemberClassRegistration(memberID, classID, status, registrationDate);
                    registrationDatabase.insertRecord(record);
                    return true;
            } 
            else {
                    return false;
                 }
            }
        return false;
    }

    public boolean cancelRegistration(String memberID, String classID) {
        if (memberDatabase.contains(memberID) && classDatabase.contains(classID)) {
            if (registrationDatabase.contains(memberID + "," + classID)) {
                MemberClassRegistration temp = registrationDatabase.getRecord(memberID + "," + classID);
                Class classToRegister = classDatabase.getRecord(classID);
                LocalDate curDate = LocalDate.now();
                LocalDate regDate = temp.getRegistrationDate();
                int differenceDays = (int) ChronoUnit.DAYS.between(curDate, regDate);
                if (differenceDays <= 3) {
                    classToRegister.setAvailableSeats(classToRegister.getAvailableSeats() + 1);
                    temp.setRegistrationStatus("cancelled");
                    registrationDatabase.deleteRecord(memberID + "," + classID);
                    return true;
                }
                else
                    return false;
            }
        }
        return false;

    }

    public ArrayList<MemberClassRegistration> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() {
        registrationDatabase.saveToFile();
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
    }
}
