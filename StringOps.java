public class StringOps 
{
    public static void main(String[] args) 
    {
         
    }

    public static String capVowelsLowRest (String str) 
    {
        String res = "";
        for (int i = 0; i<str.length(); i++)
        {
            str = lowerCase(str);
            char ch = str.charAt(i);
            int ascii = ch ;
            if(str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'a' || str.charAt(i) == 'u' || str.charAt(i) == 'o')
            {
                int asciiLow = ascii - 32; 
                res = res + ((char)asciiLow);
            }
            else
            {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static String camelCase (String str) 
    {
       
        String res = "";
        String temp = "";
        int start = 0;
        int stop = 0;
        int c = amountOfSpaces(str);
        if(c == 0)// if there is no space, return the word in small leters
        {
            res = lowerCase(str);
        }
        else// there are some spaces
        {
           for(int i = 0; i<=c; i++)
           {
                if(start == 0)// makes the first word in small leters
                {
                    stop = str.indexOf(' ');
                    res+= lowerCase(str.substring(start,stop));
                    
                }
                else
                {
                    stop = str.indexOf(' ',start);
                    if(stop == -1)
                    {
                        res+= makesItPerfect(str.substring(start));
                    }
                    else
                    {
                        res+= makesItPerfect(str.substring(start, stop));
                        start = stop+1;
                    }
                }
                start = stop+1;
           }
        }
        return res ;
    }

    public static int[] allIndexOf (String str, char a) 
    {
        int arrayIndex = 0;
        int c = 0;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)== a)
            {
                c++;
            }
        }
        int [] array =new int [c];
        if(c==0)
        {
            array[c] = 0;
        }
        else
        {
            for (int j=0; j<str.length(); j++)
            {
                if(str.charAt(j) == a)
                {
                    array[arrayIndex] = j;
                    arrayIndex++;
                }
            }
        }
        return array;
        
    }
    public static boolean isThereSpace(String str) 
    {
        boolean flag = false;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)!= ' ')
            {
                continue;
            }
            else
            {
                flag = true;
                break;
            }
        }
      
        return flag;
    }
    public static String makesItPerfect(String str) 
    {
        String res = "";
        char ch = str.charAt(0);
        int ascii = ch ;
        if (ascii>=97 && ascii<=122)// if small leter make it capital
            {
                int asciiC = ascii - 32; 
                res = res + ((char)asciiC);
            }
        else
        {
            res += str.charAt(0);
        }
        for (int i = 1; i< str.length(); i++)
        {
            ch = str.charAt(i);
            ascii = ch ;
            if (ascii>=64 && ascii<=90)// if capital leter make it small
            {
                int asciiLow = ascii + 32; 
                res = res + ((char)asciiLow);
            }
            else
            {
                res += str.charAt(i);
            }
        }
      
        return res;
    }
    public static String lowerCase(String s) 
    {
        
        String res = "";
        for (int i = 0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            int ascii = ch ;
            if (ascii>=65 && ascii<=94)
            {
                int asciiLow = ascii + 32; 
                res = res + ((char)asciiLow);
            }
            else
            {
                res = res + ch;
            }
        }
        return res;
    }
}
