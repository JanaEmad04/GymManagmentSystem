package gymmanagmentsystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainerRole {

    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;

    public TrainerRole() {

    }

    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        Member record = new Member(memberID, name, membershipType, email, phoneNumber, status);
        memberDatabase.insertRecord(record); //insertRecord will check if member already exists
    }

    public ArrayList<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        Class new_class = new Class(classID, className, trainerID, duration, maxParticipants);
        classDatabase.insertRecord(new_class);
    }

    public ArrayList<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        if (memberDatabase.contains(memberID)) {
            if (classDatabase.contains(classID)) {
                Class classToRegister = classDatabase.getRecord(classID);
                if (classToRegister.getAvailableSeats() > 0) //If there are avaliable seats
                {
                    classToRegister.setAvailableSeats(classToRegister.getAvailableSeats() - 1);
                    String status = "active";
                    registrationDate = LocalDate.now();
                    MemberClassRegistration record = new MemberClassRegistration(memberID, classID, status, registrationDate);
                    registrationDatabase.insertRecord(record);
                    
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
    public boolean cancelRegistration (String memberID, String classID)
    {
        //issues a refund asdo eh??
        if(registrationDatabase.contains(memberID+","+classID))
        {
        MemberClassRegistration temp=registrationDatabase.getRecord(memberID+","+classID);
        Class classToRegister = classDatabase.getRecord(classID);
        classToRegister.setAvailableSeats(classToRegister.getAvailableSeats()+1);
        //verfies the date m4 fahma a verify eh?
        temp.setRegistrationStatus("cancelled");
        return true;
        }
        return false;
        
    }
    public ArrayList<MemberClassRegistration> getListOfRegistrations ()
    {
        return registrationDatabase.returnAllRecords();
    }
    public void logout()
    {
    //Writes all unsaved member, class, and registration data to their respective files 
    //before logging out. 
    }
}
