import java.io.PrintStream;
import java.util.Arrays;

public class HWsort {
    public static void main (String[] args)
    {
        int [] array = {9,0,7,3,1,5,4,8};
        for (int i = 0; i<array.length; i++)
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
        System.out.println(Arrays.toString(array));

    }
}
