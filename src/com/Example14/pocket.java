package com.Example14;

import java.util.Objects;

public class pocket<T> {
    public static void main(String[] args) {
        pocket<String> pocket = new pocket<String>();
        pocket.setData("");
    }
    private T data;

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        pocket other = (pocket) obj;
        return Objects.equals(data, other.data);
    }

    @Override
    public String toString() {
        return "pocket [data=" + data + "]";
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public pocket() {
        super();
        this.data = data;
    }
}
