public class Main2 {
    public static void main(String[] args) {
        int a = 1;
        int s = 0;
        String n = "dfgcgc";
        String n1 = "";
        int b = n.length() - 1;
        while (b >= 0){
            n1 += n.charAt(b);
            b -= 1;
        }
        System.out.println(n1);
        System.out.println(n);
        while (a < 1000001){
            String c = String.valueOf(a);
            String c1 = "";
            int r = c.length() - 1;
            while (r >= 0){
                c1 += c.charAt(r);
                r -= 1;
                if (c.equals(c1)){
                    String d = Integer.toBinaryString(a);
                    String d1 = "";
                    int t = d.length() - 1;
                    while (t >= 0){
                        d1 += d.charAt(t);
                        t -= 1;
                        if (d.equals(d1)){
                            s += a;
                        }
                    }
                }
            System.out.println(a);
            a += 1;
        }
        System.out.println(s);
    }  
}
