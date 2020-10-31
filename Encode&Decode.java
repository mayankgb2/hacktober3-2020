import java.util.*;
class code
{
    public static String code(String h)
    {
        String k="";int c=0;int ch;
        for(int i=0;i<h.length();i++)
        {
            c=0;
            ch=(int)h.charAt(i);
            while(ch>0)
            {
                int d=ch%100;
                c=c*10+d;
                ch=ch/10;
            }
            k=Integer.toString(c)+k;
        }
        return k;
    }
    public static String decode(String h)
    {
        int k=Integer.parseInt(h);
        String m="";
        int s=0;
        while(k>0)
        {
            int d=k%10;
            s=s*10+d;
            k=k/10;
        }
        int x;
        while(s>0)
        {
            if(s%100<=90)
            {
              x=s%100;
              if(x>=65 && x<=90 || x==32 || x>=97 && x<=99)
              {
                  m=Integer.toString((char)x)+m;
                  s=s/100;
                }
            }
            else if(s%1000<=122 && s%1000>=100)
            {
                x=s%1000;
                m=Integer.toString((char)x)+m;
                s=s/1000;
            }
        }
        return m;
    }
    
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n;String k="";
        System.out.println("Enter the Sentence");
        n=in.nextLine();
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch==32 || ch>=65 && ch<=90 || ch>=97 && ch<=122)
            {
                k=k+ch;
            }
        }
        String z=code(k);
        System.out.println("Code="+z);
        String e=decode(z);
        System.out.println("Decode"+e);
    }
}
 
