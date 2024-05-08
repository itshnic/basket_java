package presenter;

import java.util.HashMap;
import java.util.Map;

public class GetInfo {

    public String maxLongNameProduct(String[] array) {
        int maxLength = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if(maxLength<array[i].length()){
                maxLength=array[i].length();
            }
        }
        String listLongName = "";
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (maxLength == array[i].length()) {
                listLongName += (count++)+". "+array[i]+"; ";
            }
        }
        return listLongName;
    }

    public int count(String[] array) {
        return array.length;
    }

    public Map<String, Integer> duplicate(String[] array) {
        Map<String, Integer> searchDuplicate = new HashMap<>();
        for (String product : array) {
            if (!searchDuplicate.containsKey(product)){
                searchDuplicate.put(product,1);
            } else {
                searchDuplicate.replace(product,searchDuplicate.get(product)+1);
            }
        }
        return searchDuplicate;
    }

}
