package za.ac.cput.schoolmanagement.helper;

import com.sun.tools.javac.util.StringUtils;

import static com.sun.tools.javac.util.StringUtils.*;
import static jdk.internal.joptsimple.internal.Strings.EMPTY;
import static sun.util.locale.LocaleUtils.isEmpty;

public class HelpStrings {
    public static boolean isEmptyOrNull(String str) {return isEmpty(str);}

    public static String setEmptyIfNull(String str){
        if (isEmptyOrNull(str)) return EMPTY;
        return str;
    }


    public static void checkStringParam(String paramName, String paramValue){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value : %s",paramName));
    }

}
