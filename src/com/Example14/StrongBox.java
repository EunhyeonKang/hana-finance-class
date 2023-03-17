package com.Example14;

public class StrongBox<T> {
    public static void main(String[] args) {
        StrongBox sb = new StrongBox(KeyType.PADLOCK);
        sb.put("돈");

        for (int i = 0; i < 1300; i++) {
            System.out.println(sb.get());
        }

    }

    public StrongBox(KeyType type) {
        this.type = type;
        count = 0;
    }

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        count++;
        if (count <= type.getValue()) {
            return null;
        } else {
            return item;
        }

    }

    private T item;
    private KeyType type;
    private int count;

    public enum KeyType {
        PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);

        private final int value;

        KeyType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }



}
