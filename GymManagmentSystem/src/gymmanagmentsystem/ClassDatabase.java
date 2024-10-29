package gymmanagmentsystem;


public class ClassDatabase extends Database<Class> {

    public ClassDatabase(String fileName) {
        super(fileName);
    }

   @Override
    public Class createRecordFrom(String line) {
        String[] separatedStr = line.split(",");
        String Id = separatedStr[0].trim();
        String name = separatedStr[1].trim();
        String trainerId = separatedStr[2].trim();
        int duration = Integer.parseInt(separatedStr[3].trim()); //Converted to int
        int availableSeats = Integer.parseInt(separatedStr[4].trim()); //Converted to int
        Class newClass = new Class(Id, name, trainerId, duration, availableSeats);
        return newClass;
    }

}
