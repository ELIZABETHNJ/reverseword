# reverseword
import java.io.*;
import java.util.*;
public class Rev
{
  public static void main (String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      String str=br.readLine();
      String s[]=str.split(" ");
      String rst=" ";
      
      for(int i=s.length-1;i>=0;i--)
      {
        rst +=(s[i]+" ");
      }
      System.out.println(rst.trim());
      
    
  }
}
