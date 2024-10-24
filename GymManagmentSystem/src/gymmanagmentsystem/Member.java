package gymmanagmentsystem;

public class Member {
    private String memberId;
    private String name;
    private String membershipType;
    private String email;
    private String phoneNumber;
    private String status;

    public Member(String memberId, String name, String membershipType, String email, String phoneNumber, String status) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

public String lineRepresentation()
   {
       String s = memberId+", "+name+", "+membershipType+", "+email+", "+phoneNumber+", "+status;
       return s;
   }

   public String getSearchKey()
   {
       return memberId;
   }    
    
}
