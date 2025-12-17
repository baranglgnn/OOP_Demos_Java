package FilterPipelinePackage;

import java.util.*;


public class Main {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter your word : ");
    	
    	String input = scan.nextLine();
    	
    	scan.nextLine();
    	
        System.out.println("Please choose a filter:");
        System.out.println("1: LowerCaseFilter");
        System.out.println("2: RemoveDigitsFilter");
        System.out.println("3: ReplaceFilter");
        System.out.println("4: ReverseFilter");
        System.out.println("5: TrimFilter");
        System.out.println();
        
        int choice = scan.nextInt();
        
        HashMap<Integer,Filter> filters = new HashMap<>();
        filters.put(1, new LowerCaseFilter());
        filters.put(2, new RemoveDigitsFilter());
        filters.put(3, new ReplaceFilter());
        filters.put(4, new ReverseFilter());
        filters.put(5, new TrimFilter());
        
        Filter selectedFilter = filters.get(choice);
        FilterPipeline pipeline = new FilterPipeline();
        pipeline.addFilter(selectedFilter);
        System.out.println("Filtered text : " + pipeline.applyAll(input));
      
    }
}


