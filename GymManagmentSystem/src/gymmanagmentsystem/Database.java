package gymmanagmentsystem;

import java.util.ArrayList;

interface Database <ReturnType>{

    public void readFromFile();
    public ReturnType createRecordFrom(String line);
    public ArrayList<ReturnType> returnAllRecords();
    public boolean contains(String key);
    public ReturnType getRecord(String key);
    public void deleteRecord(String key);
    public void saveToFile();
   
}
