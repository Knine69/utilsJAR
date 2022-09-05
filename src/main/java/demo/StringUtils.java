package demo;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public boolean isPositiveNumber(String number) {
        return NumberUtils.createInteger(number) >= 0;
    }

    public boolean checkIfNumber(String input){
        return NumberUtils.isCreatable(input);
    }

}