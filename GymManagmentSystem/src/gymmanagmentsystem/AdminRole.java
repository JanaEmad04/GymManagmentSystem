package gymmanagmentsystem;

import java.io.IOException;
import java.util.ArrayList;

public class AdminRole {
  private TrainerDatabase dataBase;

    public AdminRole()
    {
        
    }
    
    void addTrainer(String trainerId, String name, String email, String speciality, String phoneNumber)
    {
        boolean flag= true; 
        for(int i=0; i<dataBase.records.size(); i++)
            if(dataBase.contains(trainerId))
                flag=false;
        if(flag) 
        {
            Trainer newTrainer = new Trainer(trainerId, name, email, speciality, phoneNumber);
            dataBase.insertRecord(newTrainer);
        }
    }
    ArrayList<Trainer> getListOfTrainers ()
    {
        return dataBase.returnAllRecords();
    }
    void removeTrainer (String key)
    {
       int indexRecord=-1;
        for(int i=0; i<dataBase.records.size(); i++)
            if(dataBase.contains(key))
                indexRecord=i;
        if(indexRecord>0) dataBase.records.remove(indexRecord);
        else System.out.println("This Trianer Does Not Exist.");
    }
    void logout () throws IOException
    {
      dataBase.saveToFile();
      //arg3 lel menu tany aw a-logout somehow
    }
}
