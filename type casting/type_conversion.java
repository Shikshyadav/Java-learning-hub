class type_casting{
    public static void main(String[] args) {
        //converting explicitly is casting
        byte b = 127;
        int n = b;

        // int k = 127;
        // byte m = k;  //this will not run caz byte is smaller then int and it cannot be converted hence casting is one
        
        byte c=127;
        int i=257;
        //here when converting byte to int then it will use modulo caz the range for byte is 127 so it will perform 257%256=1


        int k = 127;
        byte m = (byte) k; //this will run because we are explicitly casting int to
         float f = 3.5f;//while converting we will loose the value behind the decimal
        // int i = (int) f; //this will run because we are explicitly casting float to
        System.out.println(m);
    }
}
