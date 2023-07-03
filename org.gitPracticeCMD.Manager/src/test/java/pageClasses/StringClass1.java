package pageClasses;

public class StringClass1 
{
	public String x;
	public StringClass1() {}
	public String wordsInString(String s)
	{
		this.x=s;
		String []y= x.split(" ");
		return "number of words in the given sentance are "+y.length;
	}

}
