public class Local {
    public static void main(String[] args) {
        int a = 4;
        if(a >=2){
            int b = 6;
            System.out.println("b in if: ");
            System.out.println(b);
            a+=b;
            System.out.println(a);
        }
        System.out.println();
        int b = 7;
        System.out.println("b outside: ");
        System.out.println(b);


        // ინიციალიზაციის გარეშე არ აქვს მინშვნელობა და ვერ დავბეჭდავთ
        int c;
        System.out.println(c);

    }
}
