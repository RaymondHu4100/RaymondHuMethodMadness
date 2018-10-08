package RaymondHu;

public class main {

    public static void main(String[] args)
    {
        System.out.println(RHuLib.isPalindrome("racecar"));                                      //When a Palindrome such as 'racecar' is used as the input, it should return true.
        System.out.println(RHuLib.isPalindrome("foo"));                                          //When a non-Palindrome such as 'foo' is used as the input, it should return false.
        System.out.println(RHuLib.dateStr("01/08/1999"));                                       //When a date such as '01/08/1999' is used as the input, it should return '08-01-1999'.
        System.out.println(RHuLib.cutOut("catatonic cat", "cat"));                      //When a main string such as 'catatonic cat' and a sub string such as 'cat' is used in the input, it should return 'atonic cat'.
        System.out.println(RHuLib.sumUpTo(5));                                                  //When an integer such as '5' is used in the input, it should return '15'.
        System.out.println(RHuLib.leastCommonMultiple(37,46,36));                                      //When three integers such as '37', '46', and '36' are used in the input, it should return '30636'.
    }
}
