package life;
import java.util.Scanner ;

public class array 
{
    
    public static void main (String[] args)
    {

        /*
        int[] array = {7 , 3 , 8 , 9 , 20 , 19 } ;

        int max = array[0] ;

        for(int index = 1 ; index < 6 ; index++ )
        {
            
            // To compare value in array by max.
            // if value greater than max .
            // Then value equals max
            System.out.println(array[index]);
             if( array[index] < max )
             {
                // Then , max equals value.
               array[index] = max ;  
             }
            

             // To interchange max by itration.
             max = array[index] ;
           
        }

        System.out.println("Max is  : " + max) ;
        */


        /*
                // array to store values 
        int[] array = a ;
 
        // initilaze variables.
        int index = 0 ;
        int x  = number ;

        // While-loop to count how many array will take itration.
        // Two coditions ,first to how many index in array.
        // The second to check value stored at index 
        // don't equals the value stored in x . 
        while((index <= array.length) && (x != array[index]))
        {
            // To increase by iteration and
            // when print on screen doesn't begain 
            // From 0 .
           index ++ ;
           System.out.println("number of itrationes :" + index);
           
        }
        //IF-condition to chcek .
        // if array index less than .
        // or equals to array length .
        // eles , 
      if (index <= array.length)
      {
          // To displaying where x value store. 
          System.out.println("location in " + index) ;
      }
      else 
      {
          // To Displaying location don't founded meaing the value stored in index it's not here.
          System.out.println("location is "  + index + " but this is lcation con't found it tis mean is 0");
      }
        */


        int[] array = {1 , 45 ,55 ,35 ,65 ,54, 75, 85, 95, 45, 25, 35, 15} ;

        int x = 85 ;
        int index = 1 ;
        int midpoint = 0 ;

        while(index < array.length)
        {
            //index++ ;
            midpoint = ((index + array.length) / 20) ;
            if(x > array[index])
            {
                index = midpoint + 1 ;
            }
            else
            {
                index = array.length ;
            }
            index ++;
        }

        if(x == array[index])
        {
            System.out.println("Location : " + index);
            System.out.println("Value : " + array[index]);
        }
        else
        {
            System.out.println("Location is :" + 0 );
        }



      
        
           } 

}


