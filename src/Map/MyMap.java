package Map;

import java.util.ArrayList;

public class MyMap <T,P>{
    ArrayList<T> keyList;
    ArrayList<P> valueList;
    public MyMap() {
        valueList = new ArrayList<>();
        keyList = new ArrayList<>();
    }

    public void put(T key, P value) {
        int index;

        if(keyList.contains(key)) {
            index = keyList.indexOf(key);
            valueList.set(index,value);
        } else {
            keyList.add(key);
            valueList.add(value);
        }
    }

    public P get(T key) {
        int index;

        if(!keyList.contains(key)) {
            return null;
        }

        index = keyList.indexOf(key);
        return valueList.get(index);
    }

    public P remove(T key) {
        P retValue;
        int index;

        if(!keyList.contains(key)) {
            return null;
        }

        index = keyList.indexOf(key);
        retValue = valueList.get(index);

        keyList.remove(key);
        valueList.remove(index);

        return retValue;
    }

}
