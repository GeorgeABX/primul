import java.io.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Facultate\\PP\\lab1\\lab1_pb2\\exemplu.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s,fin=new String();
        while ((s = br.readLine()) != null){
            System.out.println(s);
            fin+=s;
        }
        int i;
        StringBuilder str=new StringBuilder(fin);
        for (i=0;i< fin.length();i++)
            if(str.charAt(i)==',' ||str.charAt(i)=='.'||str.charAt(i)=='!'||str.charAt(i)=='?')
                str.setCharAt(i,' ');
        System.out.println(str);

        StringBuilder str2=new StringBuilder(str);
        for (i=1;i< str2.length();i++)
        {
            if(str2.charAt(i-1)==' ' && str2.charAt(i)==' ') {
                str2.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(str2);
        StringBuilder str3=new StringBuilder(str2);
        str3.setCharAt(0,(char)(str3.charAt(0)-32));
        for (i=1;i< str3.length();i++)
        {
            if(str3.charAt(i)==' ') {
                str3.setCharAt(i+1,(char)(str3.charAt(i+1)-32));
            }
        }
        System.out.println(str3);
    }
}
