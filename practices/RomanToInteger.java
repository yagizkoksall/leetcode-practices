package practices;

import java.util.HashMap;

class RomanToInteger {


    public int romanToInt(String s) {
        HashMap<Character, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put('I', 1);
        integerHashMap.put('V', 5);
        integerHashMap.put('X', 10);
        integerHashMap.put('L', 50);
        integerHashMap.put('C', 100);
        integerHashMap.put('D', 500);
        integerHashMap.put('M', 1000);

        int x = s.length();

        int result = integerHashMap.get(s.charAt(x - 1));


        for (int i = x - 2; i > -1; i--) {

            if (integerHashMap.get(s.charAt(i)) >= integerHashMap.get(s.charAt(i + 1))) {

                result += integerHashMap.get(s.charAt(i));
            } else {
                result -= integerHashMap.get(s.charAt(i));
            }

        }

        return result;

    }


}
