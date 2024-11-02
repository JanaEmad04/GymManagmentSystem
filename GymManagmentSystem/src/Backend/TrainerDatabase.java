package Backend;


public class TrainerDatabase extends Database<Trainer>{


    public TrainerDatabase(String fileName) {
        super(fileName);
    }


    @Override
    public Trainer createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String Id = separatedStr[0].trim();
        String name = separatedStr[1].trim();
        String email = separatedStr[2].trim();
        String speciality = separatedStr[3].trim();
        String phoneNumber = separatedStr[4].trim();
        Trainer trainer = new Trainer(Id, name, email, speciality, phoneNumber);
        return trainer;
    }


}
