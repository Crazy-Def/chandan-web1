
public class Rev 
{
		public static String  string(String s)
		{
			
			if(s.length()==1)
			{
				return s;
				
			}
			else
			{
				String result = "" ;
				result=result+s.charAt(s.length()-1)+string(s.substring(0, s.length()-1));
				
				return result;
			}
		}
		public static void main(String[] args) 
		{
			Rev r=new Rev();
			System.out.println(r.string("chandan"));
			
		}
	
}
