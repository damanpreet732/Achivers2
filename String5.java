import java.util.* ;
class String5 
{
	static String prefix(String c , String s[] ,int t)
	{
		if(t==s.length)
		{
			return  c ;
		}
		int i = 0;
		for(i=0;i<c.length()&&i<s[t].length();i++)
		{
			if(c.charAt(i) != s[t].charAt(i))
			{
				break;
			}
		}
		return prefix(c.substring(0,i),s,t+1);
	}
	public static void main(String args[] )
	{
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		String s[] = new String [n] ;
		for(int i=0;i<n;i++)
		{
			s[i] = input.next();
		}
		if(n==0)
		{
			System.out.print("Enter valid no of Stirngs to find there common prefix");
		}
		if(n==1)
		{
			System.out.print(s[0]);
		}
		if(n>1)
		{
			System.out.print(prefix(s[0],s,1));
		}
	}
}