class ArrayExample2
{
	public static void main(String args[])
	{
		int[] values={1,2,3,4,5};
		int grantTotal=0;
		for(int i=0;i<values.length; i++)
		{
			grantTotal+=values[i];
		}
		System.out.println("Grant Total:" +grantTotal);
	}
}