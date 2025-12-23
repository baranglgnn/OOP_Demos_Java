package TemplateMethodPatternPackage;

import java.util.ArrayList;

public abstract class DataProcessor {
 public abstract void loadData();
 public abstract void processData();
 public abstract void saveData(String name,String version,ArrayList<String> data);

 public Data data;
 
 public DataProcessor() {
	 this.data= new Data();
 }
 
 public void run() {
     loadData();
     processData();
     saveData(data.getName(), data.getVersion(), data.getDataInside());
 }
}
