package com.learning.day6;

public class SixTuple<A, B, C, D, E, F> {
    private A a;
    private B b;
    private C c;
    private D d;
    private E e;
    private F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "a=" + a.getClass().getName() +
                ", b=" + b.getClass().getName() +
                ", c=" + c.getClass().getName() +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SixTuple sixTuple = new SixTuple("abc", 123, 12.3f, true, 123L, 'a');
        System.out.println(sixTuple);
    }
}
