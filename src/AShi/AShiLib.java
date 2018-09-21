package AShi;
/**ALSTON SHI 9/20/2018 */
public class AShiLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static String dateStr(String str)
    {

        String updatedDate = "";
       updatedDate += str.substring(3,5)+ "-" + str.substring(0,2) + "-" + str.substring(6);
        return(updatedDate);

    }

    public static Boolean isPalindrome(String str2)
    {
        String newWord="";
        for(int i = str2.length()-1; i >=0 ; i--) {
            newWord += str2.substring(i, i + 1);
        }

        if(str2.equalsIgnoreCase(newWord))
        {
            return (true);
        }
        else
        {
            return (false);
        }


    }
    public static int sumUpTo(int int1)
    {
            int totalSum = 0;
            while(int1 > 0)
            {
                totalSum+= int1;
                int1--;
            }
            return(totalSum);
    }
    public static void fooBarBaz(int int3)
    {
            String outPutStr= "";
            while(int3>0)
            {
                if(int3%3 == 0 && int3%5 == 0)
                {
                    outPutStr += "baz" + ",";
                }
                else{
                    if (int3 % 3 == 0) {
                        outPutStr += "foo" + "," ;

                    }
                    else
                    {
                        if(int3%5 == 0)
                        {
                            outPutStr += "bar" + ",";
                        }
                        else
                        {
                            outPutStr += int3 + ",";
                        }
                    }
                }
                int3--;
            }
        System.out.println(outPutStr);
    }
    /*
    public static int leastCommonMultiple(int num1,int num2, int num3)
    {
        int prime1=0;
        int prime2=0;
        int prime3=0;
        int a= num1-1;
        int b= num2-1;
        int c= num3-1;
        while(!num1%a)
        {

        }

    }*/
}
