import java.io.PrintStream;
import java.util.Arrays;

public class HWsort {
    public static void main (String[] args)
    {
       int [] array = {4,2,55,11,22,2,6,8,2,3,0};
  /*      for (int i = 0; i<array.length; i++)
        {
            for (int j = 0; j < array.length -1;j++)
            {   int a = 0;
                if (array[j]>array[j+1])
                {
                        a = array[j];
                        array[j] = array[j+1];
                        array[j+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(array)); */
        int i =0;
        while (i <array.length)
        {
            int j = 0;
            while (j < array.length -1)
            {   int a = 0;
                if (array[j]>array[j+1])
                {
                    a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));

    }
}
