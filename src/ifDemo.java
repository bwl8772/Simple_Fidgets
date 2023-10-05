class ifDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("A is less than B");

        // this won't output anything
        if ( a == b) System.out.println("you won't see this");

        System.out.println();

        c = a - b; //now c contains -1

        System.out.println("C contains 1");
        if (c >= 0) System.out.println("C is non-negative");
        if (c < 0) System.out.println("C is negative");
    }
}