class A33 
{
	public static void main(String[] args) 
	 {
       int size = 4;
       int alpha = 65;

      for (int i = 0; i < size; i++)
	   {
         for (int j = 0; j < i; j++) 
	      {
            System.out.print(" ");
          }
         for (int k = 0; k <= size - i; k++) 
	       {
           System.out.print((char)(alpha+k));
           }
        System.out.println();
        }
    }
}
