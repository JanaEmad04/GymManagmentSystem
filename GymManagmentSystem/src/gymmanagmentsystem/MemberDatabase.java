package gymmanagmentsystem;

public class MemberDatabase extends Database<Member> {


    public MemberDatabase(String fileName) {
      super(fileName);
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
}

