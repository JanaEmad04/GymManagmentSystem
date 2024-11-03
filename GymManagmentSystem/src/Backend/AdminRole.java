package Backend;

import Constants.FileNames;
import java.io.IOException;
import java.util.ArrayList;


public class AdminRole implements FileNames {

    public static TrainerDatabase dataBase = new TrainerDatabase(FileNames.TRAINER_FILENAME);

    public AdminRole() {
        dataBase.readFromFile();
    }

    public void addTrainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        boolean flag = true;
        for (int i = 0; i < dataBase.returnAllRecords().size(); i++) {
            if ((dataBase.contains(trainerId))) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            Trainer newTrainer = new Trainer(trainerId, name, email, speciality, phoneNumber);
            dataBase.insertRecord(newTrainer);
        }
    }

    public ArrayList<Trainer> getListOfTrainers() {
        return dataBase.returnAllRecords();
    }

    public void removeTrainer(String key) {
        int indexRecord = -1;
        for (int i = 0; i < dataBase.returnAllRecords().size(); i++) {
            if (dataBase.contains(key)) {
                indexRecord = i;
                break;
            }
        }
        if (indexRecord >= 0) {
            dataBase.returnAllRecords().remove(indexRecord);
        }
    }

    public static void logout() throws IOException {
        dataBase.saveToFile();
    }
}
