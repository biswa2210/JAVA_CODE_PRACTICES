public class pattern1
{
    public static void main(String[] args)
    {
        int rows = 5,c=1,z=1;
        System.out.println("## Printing the pattern ##");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= z; j++)
            {

                System.out.print(c + " ");
                c++;

            }
            z+=2;
            System.out.println();
        }
    }
}