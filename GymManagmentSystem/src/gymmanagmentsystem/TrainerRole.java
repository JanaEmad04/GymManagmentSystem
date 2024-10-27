package gymmanagmentsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class TrainerRole {

    private MemberDatabase memberDatabase = new MemberDatabase("Member");
    private ClassDatabase classDatabase = new ClassDatabase("Class");
    private MemberClassRegistrationDatabase registrationDatabase = new MemberClassRegistrationDatabase("Registration");

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
        System.out.println("Size:" + memberDatabase.returnAllRecords().size());
        if (flag) {
            Member record = new Member(memberID, name, membershipType, email, phoneNumber, status);
            memberDatabase.insertRecord(record); 
 System.out.println("Size:" + memberDatabase.returnAllRecords().size());
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
        System.out.println("Size:" + classDatabase.returnAllRecords().size());
        if (flag) {
            System.out.println("IM here");
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
            if (classToRegister.getAvailableSeats() > 0) //If there are avaliable seats
            {
                classToRegister.setAvailableSeats(classToRegister.getAvailableSeats() - 1);
                String status = "active";
                registrationDate = LocalDate.now();
                MemberClassRegistration record = new MemberClassRegistration(memberID, classID, status, registrationDate);
                registrationDatabase.insertRecord(record);
                System.out.println("Member registered for class.");
                return true;
            }

        }
        System.out.println("There are no available seats.");
        return false;
    }

    public boolean cancelRegistration(String memberID, String classID) {
        //issues a refund asdo eh??
        if (memberDatabase.contains(memberID) && classDatabase.contains(classID)) {
            if (registrationDatabase.contains(memberID + "," + classID)) {
                MemberClassRegistration temp = registrationDatabase.getRecord(memberID + "," + classID);
                Class classToRegister = classDatabase.getRecord(classID);
                LocalDate curDate = LocalDate.now();
                LocalDate regDate = temp.getRegistrationDate();
                int differenceDays = (int) ChronoUnit.DAYS.between(regDate, curDate);
                if (differenceDays <= 3) {
                    classToRegister.setAvailableSeats(classToRegister.getAvailableSeats() + 1);
                    temp.setRegistrationStatus("cancelled");
                    return true;
                } else {
                    System.out.println("No refund allowed within more than 3 days.");
                }
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
