package pkg1040305classpractice;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        String temp = null;
        String []tempStrings = null;
        ArrayList <String> stringArray = new ArrayList<String>(); 
        //System.out.println(temp.matches("^[a-zA-Z]*"));
        while(true)
        {
            Scanner enter = new Scanner(in);
            out.printf("Enter the String-1)break:");
            temp = enter.nextLine();
            if(temp.equals("-1") == true)
                break;
            else
            {
                tempStrings = temp.split(",|\\.| |!|:|;");
                for(int i = 0;i<tempStrings.length;i++)
                    if(tempStrings[i].matches("^[a-zA-Z]*") == true && tempStrings[i].isEmpty() != true)    //正則表示法(Regular expression)
                        stringArray.add(tempStrings[i].toLowerCase());
                for(int i = 0;i<stringArray.size();i++)
                    out.println(stringArray.get(i));
                stringArray.removeAll(stringArray);//初始化陣列
            }
        }
        
        
    }
}
