public class Reversenumbertriangle {
    public static void main(String[] args)
    {
        int i,j;
        int n=6;
        for(i=1;i<6;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
