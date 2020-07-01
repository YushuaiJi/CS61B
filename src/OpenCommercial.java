import java.net.*;
import java.io.*;

public class OpenCommercial {
    /** Prompts the user for the name X of a company (a single string), opens
     *  the Web site corresponding to www.X.com, and prints the first five lines
     *  of the Web page in reverse order.
     *  @param arg is not used.
     *  @exception Exception thrown if there are any problems parsing the
     *             user's input or opening the connection.
     */
    public static void main(String[] arg) throws Exception {

        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

        /* Replace this comment with your solution.  */
        String web = "https://www."+inputLine+".gov";
        URL u = new URL(web);
        InputStream ins = u.openStream();
        InputStreamReader isr = new InputStreamReader(ins);
        BufferedReader whitehouse = new BufferedReader(isr);
        String[] ans = new String[5];
        for(int i=0;i<ans.length;i++){
            ans[i] = whitehouse.readLine();
        }
        for(int i=ans.length-1;i>=0;i--){
            System.out.println(whitehouse.readLine());
        }
    }
}
