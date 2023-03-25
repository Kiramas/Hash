import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
    static String newText = text.toLowerCase();
    public static void main(String[] args) {
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;
        char keyMin = '0';
        char keyMax = '1';
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); i++) {
            char myChar = text.charAt(i);

            if (Character.isLetter(myChar)) {
                if (!charMap.containsKey(myChar)) {
                    charMap.put(myChar, 1);
                } else {
                    int value = charMap.get(myChar);
                    charMap.put(myChar, value + 1);
                }
            }

        }

        ArrayList<Character> keys = new ArrayList<>(charMap.keySet());
        for (int i = 0; i < charMap.size(); i++) {
            char key = keys.get(i);
            int val = charMap.get(key);
            if (maxValue < val) {
                maxValue = val;
                keyMax = keys.get(i);
            }
            if (minValue > val) {
                minValue = val;
                keyMin = keys.get(i);
            }
        }
        System.out.println("Встречается чаще всего:  " + keyMax + " количество повторов: " + maxValue);
        System.out.println("Встречается реже всего: " + keyMin + " количество повторов: " + minValue);
    }

}
