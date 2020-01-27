import java.util.* ;
class String1
{
	static int nonrepeating(String s)
	{
		s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			boolean flag = true ;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					flag = false ;
				}
			}
			if(flag == true )
			{
				return i ;
			}
		}
		return -1 ;
	}
	public static void main(String args[] )
	{
		Scanner input = new Scanner (System.in);
		String s = input.next();
		System.out.print(nonrepeating(s));
	}
}