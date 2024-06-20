class Demo {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;
        Cal neo = new Cal();
        int mnb = neo.ad(num1, num2);
        System.out.println(mnb);

    }
}

class Cal {
    public int ad(int a, int b) {
        int r = a + b;
        return r;
    }
}