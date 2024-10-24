package gymmanagmentsystem;

public interface DataBase {
   void readFromFile ();
   Trainer createRecordFrom (String line);
   ArrayList<Trainer> returnAllRecords ();
   Boolean contains (String key);
   Trainer getRecord (String key);
   void insertRecord (Trainer record);
   void deleteRecord (String key);
   void saveToFile ();

}
