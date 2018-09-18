package AShi;

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

            int asd = 1;

    }
}
