import java.util.*;
public class countsinstring
{
    public static void main(String args[])
    {
        String a="Shalini@1517";
        int vc=0;
        int cv=0;
        int nc=0;
        int sp=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='i'||a.charAt(i)=='u')
            {
                vc+=1;
            }else if(a.charAt(i)>=65&&a.charAt(i)<=90||a.charAt(i)>=97&&a.charAt(i)<=122)
            {
                cv+=1;
            }else if(a.charAt(i)>=48&&a.charAt(i)<=57)
            {
                nc+=1;
            }else{
                sp+=1;
            }
        }
        System.out.println("vowels count:"+vc);
        System.out.println("Consonant count:"+cv);
        System.out.println("Numbers count:"+nc);
        System.out.println("Special Character Count:"+sp);
    }
}