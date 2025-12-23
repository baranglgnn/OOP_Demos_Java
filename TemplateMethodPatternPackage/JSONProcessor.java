package TemplateMethodPatternPackage;

import java.util.ArrayList;

public class JSONProcessor  extends DataProcessor{
    
    public JSONProcessor(Data data) {
    	this.data=data;
    }
	
	@Override
	public void loadData() {
		System.out.println("Loading data...");
		System.out.println("Loaded Data : ");
		System.out.println("Data name : " + getData().getName());
		System.out.println("Data version : " + getData().getVersion());
		for (String inside : getData().getDataInside()) {
			System.out.println(inside);
		}
	}

	@Override
	public void processData() {
		System.out.println("Process data...");
	}

	@Override
	public void saveData(String name,String version,ArrayList<String> data) {
		getData().setName(name);
		getData().setVersion(version);
		getData().setDataInside(data);
	}
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
}
