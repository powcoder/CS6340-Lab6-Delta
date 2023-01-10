https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder

public class DeltaDebugTest {

	public static void main(String[] args) {
		DeltaDebug dd = new DeltaDebug();
        /**
         * Parameters for deltaDebug method
         * @param char_granularity - if false, use line granularity for the algorithm
         * @param program - the path of the program you're testing, e.g. "./SecretCoder"
         * @param failing_file - path of provided failing input file, e.g. "./input_file.txt"
         * @param error_msg - the program output that Delta should treat as an error, e.g. "java.lang.ArrayIndexOutOfBoundsException"
         * @param final_minimized_file - path to write minimized output file to  
         */	
		dd.deltaDebug(true, "./SecretCoder", "long_failing_text.txt", "java.lang.ArrayIndexOutOfBoundsException", "my_min_failing_text.txt");
   	}
}
