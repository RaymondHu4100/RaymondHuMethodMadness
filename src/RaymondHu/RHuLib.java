package RaymondHu;

public class RHuLib {
    public static String isPalindrome(String input)
    {
        String output = "";
        String returnValue = "";
        for (int i=input.length(); i>0; i--)                    //This 'for' function is to ensure that the output string is equal to the input in terms of their length.
        {
            output = output + input.substring(i-1,i);           //This operation is meant to receive the inverse of the input string.
        }
        int a = input.compareTo(output);                        //This function compares the input with its inverse to see if they are exactly the same forwards and backwards.
        if (a == 0)
        {
            returnValue = returnValue + "True";                 //If they are the same forwards and backwards in terms of ASCII codes/alphabetical order, when compared they should return a integer of 0 to signify this.
        }
        else
        {
            returnValue = returnValue + "False";
        }
        return returnValue;                                     //If it is a Palindrome, it should return a 'True' string. Otherwise it should return a 'False' string.
    }

    public static String dateStr(String input1)
    {
        String output1 = "";
        output1 = output1 + input1.substring(3,5) + "-" + input1.substring(0,2) + "-" + input1.substring(6);                  //This operation puts the 'dd' part in the front, followed by a dash, and the 'mm' part, followed by another dash, and finally the 'yyyy' part.
        return output1;
    }

    public static String cutOut(String mainStr, String subStr)
    {
        String result = "";
        int y = mainStr.indexOf(subStr);                                                              //The integer y receives how many integers in will the substring appear in the main string.
        result = mainStr.substring(0,y) + mainStr.substring(y+subStr.length());                       //This operation will return a 'result' string that contains the original main string minus the first occurence of the substring.
        return result;
    }

    public static int sumUpTo(int input3)
    {
        int x = 0;
        for (int h = 0; h <= input3; h++)                        //This 'for' function should ensure that it should only go up to the input integer when the operation is finished.
        {
            x = x + h;                                           //For every time that the integer h is added to the integer x, h is increased by 1 so that it could reach the input integer.
        }
        return x;
    }

    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int i = 1;
        while (i <= 999999999)                                    //This is the largest integer allowed in IntelliJ, and there should be no need to have input integers that have a least common multiple larger than this value.
        {
            if (i % num1 == 0 && i % num2 == 0 && i % num3 == 0)  //This is to ensure that there is a remainder of zero (the mod % sign finds the remainder) when each of the input integers is divided by the least common multiple, so that we know it is the lcm.
            {
                break;                                            //When we have the least common multiple, the operation will stop running when the break function is assigned.
            }
            else
            {
                i=i+1;                                            //If the integer i at its current value is not the lcm, then 1 will be added to i and the operation will keep running until the lcm is found, or until the maximum integer allowed is reached.
            }
        }
        return i;
    }
}