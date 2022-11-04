public class Test15_07 {
    public static void main(String[] args) {
/*        String s1 = "4";
        String s2 = "5";
        String s3 = new String ("Fiku");
        s3 = s3.intern();

        System.out.println(s1 == s3);



        System.out.println(s1);
        System.out.println(s1 == s3);


        Integer st1 = Integer.parseInt(s1);
        Integer st2 = Integer.parseInt(s2);

        Integer st3 = Integer.compare(st2, st1);

        System.out.println(st1 + st2);
        System.out.println(st3);
        */

        List list = new List();



        test(3,4,5);
        test(10,11);

    }

    public static void test (int b, int ... a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
