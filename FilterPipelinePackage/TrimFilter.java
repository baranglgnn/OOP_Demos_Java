package FilterPipelinePackage;

public class TrimFilter implements Filter{

	@Override
	public String apply(String input) {
		return input.replaceAll(" ", "");
	}
}
