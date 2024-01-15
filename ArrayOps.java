public class ArrayOps {
    public static void main(String[] args) 
    {
           
    }
    
    public static int findMissingInt (int [] array) {
        int [] B = array;
        int sum1 = 0 ; 
        int sum2 = 0 ;
        int max = 0 ;
        if (array[0]== 0 && array.length == 1)
        {
            return(max+1);
        }
        else
        {
            for (int i = 0; i<array.length; i++)
        {
            sum1 = sum1 + array[i];
            if(array[i]>max)
            {
                max = array[i] ;
            }
        }
        for(int j = 0; j<array.length; j++)
        {
            sum2 = sum2 + j ; 
            B[j] = j; 
        }
        sum2 = sum2 + max ; 
        }
        return sum2;
    }

    public static int secondMaxValue(int [] array) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i<array.length; i++)
        {
            if (array[i]>max1) 
            {
                max1 = array[i];
            }
        } 
        for (int j = 0 ; j<array.length ; j++)
        {
            if(array[j] == max1)
            {
                array[j] = 0;
            }
        }
        for (int t = 0; t<array.length; t++)
        {
            if (array[t]>max2) 
            {
                max2 = array[t];
            }
        } 
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
      
        boolean flag = true;
       int temp = 0;
       for(int i = 0; i<array1.length; i++)
       {
            temp = array1[i];
            for( int j = 0; j<array2.length; j++)
            {
                if(array2[j] != temp)
                {
                    flag = false;
                }
                else
                {
                    flag = true;
                    break;
                }
            }
            if (!flag) 
            {
             break;   
            }

            
       }
       return flag;
    }

    public static boolean isSorted(int [] array)
    {
        int temp = array[1]; 
        boolean flag = true;
        if(array[0]>array[1])
        {
            temp = array[0];
            for(int i = 1; i<array.length; i++)
            {
                if(array[i]<temp)
                {
                    temp = array[i];
                }
                else
                {
                    flag = false;
                    break;
                }
            }  
        }
        else
        {
            temp = array[0];
            for(int i = 1; i<array.length; i++)
            {
                if(array[i]>temp)
                {
                    temp = array[i];
                }
                else
                {
                    flag = false;
                    break;
                }
            } 
        }
        return flag;
    }

}
