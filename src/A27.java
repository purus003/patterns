class A27
{
	public static void main(String[] args) 
	{
		int  rows = 5;
		char  ch = 'A';
        for (char i = 1; i<= rows  ; i++ )
        {
			for (char j = 1; j<= rows-i ; j++ )
			{
				System.out.print(" ");
			}
			for (char k = 1; k<=i ; k++ )
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();
        }
	}
}
