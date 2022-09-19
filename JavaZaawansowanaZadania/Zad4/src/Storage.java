import java.util.*;
import java.util.stream.Collectors;

public class Storage {
    private final Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage (String key, String value) {
        if (storage.containsKey(key)){
//            List<String> values = storage.get(key);
//            values.add(value);
//            storage.put(key,values);
            storage.get(key).add(value);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            storage.put(key,values);
        }
    }

    public void printValues(String key) {
        System.out.println(storage.get(key));
    }
//entrySet: zwraca Set obiektów klucz-wartość. Pojedyncza para jest reprezentowana przez klasę wewnętrzną Map.Entry.
    public List<String> findValues (String searchedValue){
        return storage.entrySet().stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                .map(entry -> entry.getKey())
                //.map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

//    public List<String> getValues(String key) {
//        return storage.get(key);
//    }
}