package FilterPipelinePackage;

public class LowerCaseFilter implements Filter{

	@Override
	public String apply(String input) {
		return input.toLowerCase();
	}

}
