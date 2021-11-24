package com.company;

public class TwoGenerics <T1,T2>{
    private T1 value;
    private T2 value1;

    public TwoGenerics(T1 value, T2 value1) {
        this.value = value;
        this.value1 = value1;
    }

    public T1 getValue() {
        return value;
    }

    public T2 getValue1() {
        return value1;
    }

    @Override
    public String toString() {
        return "TwoGenerics{" +
                "value=" + value +
                ", value1=" + value1 +
                '}';
    }
}
