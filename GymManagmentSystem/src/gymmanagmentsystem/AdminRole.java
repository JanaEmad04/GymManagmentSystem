package gymmanagmentsystem;

import java.io.IOException;
import java.util.ArrayList;

public class AdminRole {

    private TrainerDatabase dataBase = new TrainerDatabase("Trainers");

    public AdminRole() {

    }

    public void addTrainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        boolean flag = true;
        for (int i = 0; i < dataBase.returnAllRecords().size(); i++) {
            if ((dataBase.contains(trainerId))) {
                flag = false;
                break;
            }
        }
        System.out.println("Size:"+dataBase.returnAllRecords().size());
        if (flag) {
            System.out.println("IM here");
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
        } else {
            System.out.println("This Trianer Does Not Exist.");
        }
    }

    public void logout() throws IOException {
        dataBase.saveToFile();
    }
}
