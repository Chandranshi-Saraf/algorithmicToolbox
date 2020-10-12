package algoToolbox;

public class ipvalidate {
	
	static boolean validate(String ip)
	{
		String arr[]=ip.split(".");
		int num=0;
		if(arr.length!=4)
			return false;
		for(int i=0;i<arr.length;i++)
		{
			
			try
			{
				 num=Integer.parseInt(arr[i]);
			}
			catch(Exception e)
			{
				return false;
			}
			
			if(num<0 || num >255)
				return false;
		}
		if(num %3==0 && num%5==0)
			System.out.print("Z");
		else if(num %3==0)
			System.out.print("X");
		else if(num%5==0)
			System.out.print("Y");
		
		return true;
			
	}

}

	