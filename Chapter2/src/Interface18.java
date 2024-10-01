package InheritanceInterface;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class KeyValue<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Interface18 {
    public static void main(String[] args) {
        KeyValue<Integer, String> pair = new KeyValue<>(1, "Apple");
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}

