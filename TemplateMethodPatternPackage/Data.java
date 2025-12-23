package TemplateMethodPatternPackage;

import java.util.ArrayList;

public class Data {
 private String name;
 private String version;
 private ArrayList<String> dataInside;
 
 public Data()
 {
	 this.dataInside= new ArrayList<>();
 }
 
 public Data(String name,String version,ArrayList<String> dataInside) {
	 this.name= name;
	 this.version = version;
	 this.dataInside = dataInside;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public ArrayList<String> getDataInside() {
	return dataInside;
}

public void setDataInside(ArrayList<String> dataInside) {
	this.dataInside = dataInside;
}
 
 
}
