package algorithm_practice_kit.hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public boolean solution(String[] phoneBook) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }

        for (int i = 0; i < phoneBook.length; i++){
            for (int j = 0; j < phoneBook[i].length(); j++){
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;
            }
        }

        return true;
    }
}

