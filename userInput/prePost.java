public class prePost {
    public static void main(String[] args) {
        int a = 5;
        a = a+1;
        System.out.println(a);
        
        a += 1;
        System.out.println(a);

        a++;
        System.out.println(a);

        ++a;
        System.out.println(a);

        System.out.println("Watching increment");
        int p = 5;
        //post increment
        System.out.println(p++);
        System.out.println(p);

        //pre increment
        System.out.println(++p);
        System.out.println(p);

        System.out.println("Watching decrement");
        int q = 5;
        //post decrement
        System.out.println(q--);
        System.out.println(q);

        //pre decrement
        System.out.println(--q);
        System.out.println(q);
    }
}
