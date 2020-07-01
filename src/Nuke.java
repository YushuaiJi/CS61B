import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.io.*;

public class Nuke {
    public static void main(String[] arg) throws IOException {
        BufferedReader keyboard;
        String inputLine;
        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

        if(inputLine.length() == 1 || inputLine.length() == 1){
            System.out.print("");
        }else {
            System.out.print(inputLine.substring(0, 1) + inputLine.substring(2, inputLine.length() - 1));
        }
    }

}
