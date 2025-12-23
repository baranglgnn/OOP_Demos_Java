package TemplateMethodPatternPackage;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> arrayData = new ArrayList<String>(); 
		arrayData.add("34");
		arrayData.add("35");
		arrayData.add("36");
		arrayData.add("37");
		Data data = new Data("Baran","v3.14",arrayData);
        DataProcessor dataProcessor = new CSVProcessor(data);
        dataProcessor.run();
        
	}

}
