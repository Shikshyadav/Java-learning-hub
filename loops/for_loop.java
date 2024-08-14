// class for_loop{
//     public static void main(String[] args) {
//         for (int i=1; i<15;i=i++){
//             System.out.println("hello");

//         }
//     }
// }
// print numbers from 0 to 10
class for_loop{
    public static void main(String[] args) {
        for(int i = 0; i <=10;i++){
            System.out.println(i);
            System.out.println(i + "hello");

            for(int j=0;j<=8;j++){
                System.out.println(i + " " + j);   //nested loop

            }
        }
    }
}