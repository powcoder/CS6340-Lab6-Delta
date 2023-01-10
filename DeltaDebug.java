https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class DeltaDebug {
	
	/**
	 * deltaDebug is the method is what will run the delta debug algorithm
	 * !!!!!! IMPORTANT: DO NOT CHANGE THE TYPE/METHOD SIGNATURE AS IT MUST BE THE SAME AS PROVIDED FOR GRADING !!!!!!  
	 * @param char_granularity - if false, use line granularity for the algorithm
	 * @param program - the path of the program you're testing, e.g. "./SecretCoder"
	 * @param failing_file - path of provided failing input file, e.g. "./input_file.txt"
	 * @param error_msg - the program output that Delta should treat as an error, e.g. "java.lang.ArrayIndexOutOfBoundsException"
	 * @param final_minimized_file - path to write minimized output file to  
	 */
	public void deltaDebug(Boolean char_granularity, String program, String failing_file, String error_msg, String final_minimized_file)
	{
        /*
        TODO: Add your logic for the delta debugging algorithm here
        */
	}
	
	/**
	 * readFile reads input from a file line by line
	 * You can update this method to pass in more parameters or return something if needed
	 * @param file - file to read
	 */
	public void readFile(String file)
	{
		Scanner scan;
		try {
			scan = new Scanner(new File(file));
			while (scan.hasNextLine()){
			    //do something
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * runCommand can be used to run a program 
	 * You can update this method to pass in more/different parameters or return something if needed
	 * @param command - complete command you want to run (program location + any command args)
	 * @param error - error message you're looking for
	 */
	public void runCommand(String command, String error_msg)
	{
		String s = null;
		try{ 	
            Process p = Runtime.getRuntime().exec(command);
            
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));
            // read the output from the command
            while ((s = stdInput.readLine()) != null) {
                //do something
            }
		}
		catch (IOException e) {
            System.out.println(command + "failed to run");
            System.exit(-1);
        }
	}

	/**
     * writeFile() can be used to write to a file
     * This is a basic method for writing your String to a file
     * You can use helper methods to call on this method if you wish, but we do not recommend modifying 
     * this method directly. 
     * @param file - file to write to
     * @param List<String> - abstract data structure for holding String objects, you can pass in an ArrayList<String>, for example
     */
    public boolean writeToFile(String file, List<String> list)
    {
        Path out = Paths.get(file);
        try {
            Files.write(out,list,Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }		
	

}

