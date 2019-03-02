package bool;

public class Bool {

	/** Parse an integer to a boolean value, in the style of R
	 * @param i if i is greater than zero returns true, false otherwise
	 * @return i if i is greater than zero returns true, false otherwise
	 */
	public static boolean parseBool(int i) { if (i > 0) return true; return false; }

	/** Parse a string to a boolean value
	 * @param s string to parse
	 * @return matches {"true", "t", "1"} to true and {"false", "f", "0"} to false.   
	 */
	public static boolean parseBool(String s)
	{
		String ss = s.trim();
		if (ss.equalsIgnoreCase("true")) return true;
		if (ss.equalsIgnoreCase("false")) return false;
		if (ss.equalsIgnoreCase("t")) return true;
		if (ss.equalsIgnoreCase("f")) return false;
		if (ss.equalsIgnoreCase("1")) return true;
		if (ss.equalsIgnoreCase("0")) return false;
		throw new IllegalArgumentException("Input: " + s + " could not be parsed to a boolean value");
	}
	
	public static boolean[][] intToBooleanArray(int[][] input)
	{
		boolean[][] output = new boolean[input.length][input[0].length];
		
		for (int i = 0; i < input.length; i++) for (int j = 0; j < input[0].length; j++)
			output[i][j] = parseBool(input[i][j]);
		return output;
	}
}
