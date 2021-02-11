package Ch10ArrayLists;

import java.util.regex.*;

public class RegExHelper {
    public static final Pattern isAlphaNumeric = Pattern.compile("^[a-zA-Z0-9]*$");
    public static final Pattern isAlpha = Pattern.compile("^[a-zA-Z]*$");
    public static final Pattern isNumeric = Pattern.compile("^[0-9]*$");
    public static final Pattern isHex = Pattern.compile("^[0-9a-fA-F]*$");
    public static final Pattern isFloat = Pattern.compile("^[0-9]+\\.[0-9]*?$");

    public static final Pattern isAlphaNumericSpace = Pattern.compile("^[ a-zA-Z0-9]*$");
    public static final Pattern isAlphaSpace = Pattern.compile("^[ a-zA-Z]*$");
    public static final Pattern isNumericSpace = Pattern.compile("^[ 0-9]*$");
    public static final Pattern isHexSpace = Pattern.compile("^[ 0-9a-fA-F]*$");

    public static final Pattern isASCII = Pattern.compile("^[\\x00-\\x7F]*$");

    public static final Pattern isEmail = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");

    public static final Pattern isURL = Pattern.compile("^(https?|ftps?|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]$");

    public static final Pattern isUnixTimestamp = Pattern.compile("^[0-9]+$");

    public static final Pattern isBinary = Pattern.compile("^[0-1]+$");
    public static final Pattern isOctal = Pattern.compile("^[0-7]+$");
    public static final Pattern isRomanNumeral = Pattern.compile("^[IiVvXxLlCcDdMm]+$");
    public static final Pattern isYTBase64 = Pattern.compile("^[0-9a-zA-Z-_]+$");



    // Date formats based on this list: https://docs.oracle.com/cd/E41183_01/DR/Date_Format_Types.html
    public static final Pattern isDate1 = Pattern.compile("^[0-1][0-9]/[0-3][0-9]/[0-9]{4}$");
    public static final Pattern isDate2 = Pattern.compile("^[0-3][0-9]/[0-1][0-9]/[0-9]{4}$");
    public static final Pattern isDate3 = Pattern.compile("^[0-9]{4}/[0-1][0-9]/[0-3][0-9]$");
    public static final Pattern isDateB = Pattern.compile("^[0-1][0-9][0-3][0-9][0-9]{4}$");
    public static final Pattern isDateC = Pattern.compile("^[0-3][0-9][0-1][0-9][0-9]{4}$");
    public static final Pattern isDateD = Pattern.compile("^[0-9]{4}[0-1][0-9][0-3][0-9]$");


    public static boolean match(Pattern pat, String str){
        Matcher m = pat.matcher(str);
        return m.matches();
    }

    public static Pattern mkPat(String pat){
        return Pattern.compile(pat);
    }

}
