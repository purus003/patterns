class  A30
{
	/*
	5 5 5 5 5
      4 4 4 4
         3 3 3
           2 2
             1
	
	*/
	 public static void main(String[] args) {
         int rows = 5;

        for (int i = rows; i >= 1; i--)
			{
            for (int j = 1; j <= rows - i; j++) 
			{
              System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
		    {
              System.out.print(i);
			}
            System.out.println();
        }
    }
}
