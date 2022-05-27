public class Task1 {
    public static void main(String[] args) {
       Rectangle a;
       //რადგან ინიციალიზებული არაა იქნება შეცდომა
        a.area();
        a = null;
        // ვინაიდან მნიშვნელობა null-ია, იქნება exception
        a.perimeter();
        a.getLength();
        a.getWidth();
        Rectangle b;
        System.out.println(a == b);

        Rectangle c = new Rectangle();
        Rectangle d = new Rectangle();

        //გამოიტანს false რადგან სხვადსხა ობიექტებია და სხვადასხვა მისამართებს უყურებენ
        System.out.println(d==c);

         c.setLength(5);
         c.setWidth(2);

        System.out.println(c.getLength());
        System.out.println(c.getWidth());

        d.setLength(5);
        d.setWidth(2);

        //ერთნაირი მნიშვნელობების მიუხედავათ მაინც false იქნება რადგან სხვადასხვა მისამართებს უყურებენ მიმთითებლები
        System.out.println(d==c);

        //მიმთითებლები რადგან ერთ მისმაართს უყურებენ ინქება true
        d = c;
        System.out.println(d==c);


    }}
