package za.ac.cput.util;

import org.apache.commons.lang3.StringUtils;

public class StringHelper
{
    public static boolean isEmptyOrNull(String str)
    {
        return StringUtils.isEmpty(str);
    }

    public static String setEmptyIfNull(String str)
    {
        if(isEmptyOrNull(str))
            return StringUtils.EMPTY;
        return str;
    }

    public static void checkStringParam(String paramName, String paramValues)
    {
        if(isEmptyOrNull(paramValues))
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", paramName));
    }
}
