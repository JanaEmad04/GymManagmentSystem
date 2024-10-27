
package gymmanagmentsystem;

import java.time.LocalDate;

public class MemberClassRegistration implements MainInterface {
    //This class represents a member's 
    //registration for a class and handles the registration data.
    private String memberId;
    private String classId;
    private String status;
    private LocalDate  registrationDate;

    public MemberClassRegistration(String memberId, String classId, String status, LocalDate registrationDate) {
        this.memberId = memberId;
        this.classId = classId;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getClassId() {
        return classId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    
    public void setRegistrationStatus(String status) {
       this.status=status;
    }

     @Override
    public String lineRepresentation()
   {
       String s = String.join(",", memberId,classId)+","+registrationDate+","+status;
       return s;
   }
    
    @Override
   public String getSearchKey()
   {
       String s = String.join(",", memberId,classId);
       return s;
   } 
    
}
