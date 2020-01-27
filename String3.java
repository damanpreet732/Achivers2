import java.util.* ;
class String3
{
	static int strStr(String haystack  , String needle)
	{
		return haystack.indexOf(needle);
	}
	public static void main(String args[] )
	{
		Scanner input = new Scanner (System.in);
		String haystack = input.next();
		String needle = input.next();
		System.out.print(strStr(haystack,needle));
	}
}