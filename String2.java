import java.util.* ;
class String2
{
	static int myatoi(String s)
	{
		int val = 0;
		boolean flag = false ;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='0' && c<='9')
			{
				val*=10 ;
				val += c - '0'  ;
				//System.out.print(val + " ");
			}
			else if(c=='-')
			{
				flag = true ;
			}
		}
		if(flag)
		{
			return -val ;
		}
		else return val ;
	}
	public static void main(String args[] )
	{
		Scanner input = new Scanner (System.in);
		String s = input.next();
		System.out.print(myatoi(s));
	}
}