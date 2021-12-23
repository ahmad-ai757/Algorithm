package life;

public class first 
{
    public static void main (String[] args)
    {
        isSame();
    }
    
    public static double array(double[] ar)
    {

        double mid = 0 ;
        for ( int i = 0 ;  i < ar.length ; i ++)
        {
            mid += ar[i];
        }

        return mid / ar.length ;

    }

    public static void isSame()
    {
        int index = 0 ;
        index ++ ;
        System.out.println("It's like loop : " + index ) ;

       isSame();
    }
}
   
    

