package operators;
class operators{
    public static void main(String[] args) {
        //  arithmetic operators

        int num= 6;
        num +=2; //will increase num by 2 same goes for -
        num++; //this is also similar as above but by 1
                //post increment
        ++num; //pre increment

        int num1 = 9;
        int result = num1++; //fetch the value and then increase
        int result1= ++num1; //first increase then fetch


        //RELATIONAL OPERATORS*********
        //<,>,== we use double == to see if its equal != for not equal to
        //<=,>=

        // LOGICAL OPERATORS***********
        // AND/OR/NOT
        // &-AND, |-OR, !-NOT
        //AND= both true then only true or else false
        //OR= if any one is true then true or else false
        //NOT= if true then false or else true

        //SHORT CIRCUIT--> it is a short cut
        //&& || 
        //&&--> if the first value is false it wont even check for the second value
        //||--> if the first value is true it wont even check for the second value

    }
}
