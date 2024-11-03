package Backend;

import java.io.IOException;
import java.util.ArrayList;

public class AdminRole {

    public static TrainerDatabase dataBase = new TrainerDatabase("Trainers");

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
