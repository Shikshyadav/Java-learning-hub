package basic;
class basics{
    public static void main(String[] args) {
        System.out.println("hello world");

        //variables

        int num = 5; //variable of integer type named num has value 5
        int num1 = 8;
        System.err.println(num+num1);
        int result = num1-num;
        System.err.println(result);
        System.err.println(num);
        System.out.println(3+5);
        System.out.println(3*9); 

        //DATA TYPES************

        int num2 = 7;
        byte by =127;
        short sh = 32767;
        long l = 2147483647L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'A';
        boolean b = true;
        System.out.println(num2);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);



//LITERALS*****
        int binary = 0b101;
        int octal = 0123;
        double db= 56; //integer will beconverted to double automatically i.e. 56.0
        double ep = 12e20; //here e is epsilon which also gets converted
        System.out.println(binary);
        System.out.println(octal);
        char cd = 'a';
        cd++;
        System.out.println(cd);

}
}



 