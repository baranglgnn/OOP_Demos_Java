package FilterPipelinePackage;

public class ReplaceFilter implements Filter {

	@Override
	public String apply(String input) {
		return input.replaceAll("a", "@");
	}
}
