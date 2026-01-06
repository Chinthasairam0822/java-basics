public class AdditionPatetrn {
    public static void main(String[] args)
    {
        int i,j;
        int n= 5;
        int mid = n/2 + 1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i == mid || j ==mid)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
}
