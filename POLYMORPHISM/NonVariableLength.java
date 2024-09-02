class Addition {
    public void add(int i, int j) {
        System.out.println("sum : "+(i+j));
    }

    public void add(int i, int j, int k) {
        System.out.println("sum : "+(i+j+k));
    }

    public void add(int i, int j, int k, int l) {
        System.out.println("sum : "+(i+j+k+l));
    }

    public void add(int i, int j, int k, int l, int m) {
        System.out.println("sum : "+(i+j+k+l+m));
    }

    public void add(double d, double e) {
        System.out.println("sum : "+(d+e));
    }

}

class NonVariableLength {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(10,20);
        addition.add(10,20,30);
        addition.add(10,20,30,40);
        addition.add(10,20,30,40,50);
        addition.add(10.5, 15.5);
    }
}