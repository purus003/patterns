class P19
{
	public static void main(String[] args) 
	{
		char rows = 'E';
		for(char i = 'A'; i <= rows; i++)
		{
			for(char j = 'A'; j <= (rows + 'A' - i); j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}