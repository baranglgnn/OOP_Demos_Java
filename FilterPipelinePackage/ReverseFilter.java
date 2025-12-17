package FilterPipelinePackage;

public class ReverseFilter implements Filter {

	@Override
	public String apply(String input) {
		char [] in = input.toCharArray();
		int begin = 0;
		int end = input.length()-1;
		char temp;
		while(end>begin)
		{
		temp=in[begin];
		in[begin]=in[end];
		in[end]=temp;
		end--;
		begin++;
		}
		return new String(in);
	}
}
