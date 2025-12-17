package FilterPipelinePackage;

import java.util.*;

public class RemoveDigitsFilter implements Filter {

	@Override
	public String apply(String input) {
		ArrayList<String> nums = new ArrayList<>();
		nums.add("0");
		nums.add("1");
		nums.add("2");
		nums.add("3");
		nums.add("4");
		nums.add("5");
		nums.add("6");
		nums.add("7");
		nums.add("8");
		nums.add("9");
		 StringBuilder result = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            String s = String.valueOf(c);
	            if (!nums.contains(s)) {
	                result.append(c);
	            }
	        }
		return result.toString();
	}

}
