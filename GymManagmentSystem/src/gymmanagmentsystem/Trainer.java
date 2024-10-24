package gymmanagmentsystem;

public class Trainer {
   private String trainerID;
   private String name;
   private String email;
   private String speciality;
   private String phoneNumber;

    public Trainer(String trainerID, String name, String email, String speciality, String phoneNumber) {
        this.trainerID = trainerID;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
   
  public String lineRepresentation()
   {
       String s = trainerID+", "+name+", "+email+", "+speciality+", "+phoneNumber;
       return s;
   }

   public String getSearchKey()
   {
       return trainerID;
   }
   
}
