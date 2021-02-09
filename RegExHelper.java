package Ch10ArrayLists;

import java.util.regex.*;

public class RegExHelper {
    public static final Pattern isAlphaNumeric = Pattern.compile("^[a-zA-Z0-9]*$");
    public static final Pattern isAlpha = Pattern.compile("^[a-zA-Z]*$");
    public static final Pattern isNumeric = Pattern.compile("^[0-9]*$");
    public static final Pattern isHex = Pattern.compile("^[0-9a-fA-F]*$");
    public static final Pattern isDecimal = Pattern.compile("^[0-9]+\\.[0-9]*?$");

    public static final Pattern isAlphaNumericSpace = Pattern.compile("^[ a-zA-Z0-9]*$");
    public static final Pattern isAlphaSpace = Pattern.compile("^[ a-zA-Z]*$");
    public static final Pattern isNumericSpace = Pattern.compile("^[ 0-9]*$");
    public static final Pattern isHexSpace = Pattern.compile("^[ 0-9a-fA-F]*$");

    public static final Pattern isASCII = Pattern.compile("^[\\x00-\\x7F]*$");

    public static final Pattern isEmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static final Pattern isURL = Pattern.compile("^(https?|ftps?|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");

    public static boolean match(Pattern pat, String str){
        Matcher m = pat.matcher(str);
        return m.matches();
    }

    public static Pattern mkPat(String pat){
        return Pattern.compile(pat);
    }

}
