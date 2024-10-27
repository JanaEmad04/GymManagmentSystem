package gymmanagmentsystem;

public class Trainer implements MainInterface {
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
   
   @Override
  public String lineRepresentation()
   {
       String s = String.join(",",trainerID,name,email,speciality,phoneNumber);
       return s;
   }

   @Override
   public String getSearchKey()
   {
       return trainerID;
   }
   
}
