package AShi;
/**ALSTON SHI 9/20/2018 */
public class AShiLib {
    /**
     * @param str is the the parameter given by the user.
     * THIS IS A TEST/ EXAMPLE
     */
    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * Used substrings to extract specific information on the date and converts it to a new format.
     * @param str is the String parameter
     * @return returns a string with a reorganized date.
     */
    public static String dateStr(String str)
    {

        String updatedDate = "";
       updatedDate += str.substring(3,5)+ "-" + str.substring(0,2) + "-" + str.substring(6);
        return(updatedDate);

    }

    /**
     * I used a for loop to add each separate letter from the str2 to a new String.
     * This string is later used to compare the two strings to check if they are equal.
     *
     * @param str2 is the inputed string to check if it is Palindrome.
     * @return a boolean determining if the word spelled backwards is the same while ignoring the cases.
     */

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

    /**
     * I used mod to figure out if it was divisible by 3,5 or both. Will return 0 if is true which will allow me to create the outPut.
     * Integers from 0 to int3, divisible by 3 and 5 are replaced with baz and a comma
     * Integers from 0 to int3, divisible by 3 are replaced with foo and a comma.
     * Integers from 0 to int3, divisible by 5 are replaced with bar and a comma.
     * If not applicable it stays as the same integer.
     * @param int3 is an integer that marks the end.
     *             Displays 0 to int3 and the integers in between will change to baz, foo or bar depending on if it is divisible by 3, 5 or both.
     *
     */
    public static void fooBarBaz(int int3)
    {
        String outPutStr= "";
        int intg = 0;
        while(intg <= int3)
        {
            if(intg%3 == 0 && intg%5 == 0)
            {
                outPutStr += "baz" + ", ";
            }
            else{
                if (intg % 3 == 0) {
                    outPutStr += "foo" + ", " ;

                }
                else
                {
                    if(intg%5 == 0)
                    {
                        outPutStr += "bar" + ", ";
                    }
                    else
                    {
                        outPutStr += intg + ", ";
                    }
                }
            }
            intg++;
        }
        System.out.println(outPutStr);
    }

    /**
     *  The sequence will sum up all the numbers from [0,int1]
     * @param int1 is the last number of the sequence.
     * @return the sum of the sequence from [0,int1]
     */
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

    /**
     *  The output will show the base multiplied by the range starting from 0 to range.
     *  The base*range=answer will be separated by a "|"
     * @param base This is the base number of the Multiplication Table.
     * @param range This is the last range number of the Multiplication Table, from [0,range]
     */
    public static void multiplicationTable(int base, int range)
    {
        String mList="";
        for(int i = 0 ; i <= range; i++)
        {
            int product = base*i;
            mList += base + "*" + i + "=" + product + "|";
        }
        System.out.println(mList);
    }

    /**
     * Finds the roots of the quadratic function using the quadratic formula.
     * WIll return imaginary if no real roots are found.
     *
     * @param a the value of a in quad form
     * @param b the value of b in quad form
     * @param c the value of c in quad form
     * @return The roots of the quadratic equation or an Error explaining that there are imaginary roots. It will also return an error if A value is not greater than 0.
     */
    public static String quadSolver(double a, double b, double c)
    {
        double insideRadical= Math.pow(b,2) - 4*a*c;
        double radicalSign = Math.sqrt(insideRadical);
        double negB = b * -1;
        double doubA = a * 2;
        if( a  == 0 )
        {
            return("Enter a non zero A Term");

        }
        if (insideRadical < 0)
        {
            return("Sorry There Are No Real Roots, The Roots Are Imaginary");
        }
        else
        {
            return((negB-radicalSign)/ doubA + ", " + (negB + radicalSign)/ doubA );
        }


    }
}
