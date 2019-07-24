package main.java;

@FunctionalInterface
interface MyInterface {
    int calculate(int x);
}

class Test {

    public static void main(String[] args) {
        int a = 5;

        MyInterface s = (int x) -> x * x;

        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
