public class Inveretdpyramid {
    public static void main(String[] args)
    {
        int i;
        int j;
        int k;
        int n=9;
        for(i=1;i<=5;i++)
        {
            for(k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=n-2*i+2;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
