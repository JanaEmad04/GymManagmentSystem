
package gymmanagmentsystem;


import java.time.LocalDate;


public class  MemberClassRegistrationDatabase extends Database<MemberClassRegistration> {


    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
    }
    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String memeberId = separatedStr[0];
        String classId = separatedStr[1];
        String status = separatedStr[2];
        LocalDate registrationDate = LocalDate.parse(separatedStr[3]);
        MemberClassRegistration newMemberRegister = new MemberClassRegistration(memeberId, classId, status, registrationDate);
        return newMemberRegister;
    }
}

