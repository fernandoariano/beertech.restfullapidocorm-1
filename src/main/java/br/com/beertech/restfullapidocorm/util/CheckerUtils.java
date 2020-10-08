package br.com.beertech.restfullapidocorm.util;

public class CheckerUtils {

    private static final String STRING_EMPTY = "";

    public CheckerUtils() { }

    public static Boolean isNotNullOrEmpty(Object value) {
        return !isNull(value) || !isEmpty(value);
    }

    public static Boolean isNullOrEmpty(Object value) {
        return isNull(value) || isEmpty(value);
    }

    public static Boolean isNull(Object value) {
        return value == null;
    }

    public static Boolean isEmpty(Object value) {
        return STRING_EMPTY.equals(value);
    }
    
}