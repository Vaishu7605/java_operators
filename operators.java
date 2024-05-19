
public class operators {

    public static void main(String[] args) {

        // Airthmetic operators
        int a = 13;
        int b = 7;
        // 1.Addition
        System.out.println("a + b =" + (a + b));
        // 2. Substraction
        System.out.println("a - b =" + (a - b));
        // 3.Multiplication
        System.out.println("a * b =" + (a * b));
        // 4.Division
        System.out.println("a / b =" + (a / b));
        // 5. Modulus
        System.out.println("a % b =" + (a % b));

        // Assignment Operators
        int c = 4;
        int var;
        // assign value using =
        var = c;
        System.out.println("var using = :" + var);
        // assign value using =+
        var += c;
        System.out.println("var using += :" + var);
        // assign value using =*
        var *= c;
        System.out.println("var using *=:" + var);

        // Relational Operators
        int d = 8;
        int e = 12;
        // value of d and e
        System.err.println("d is " + d + "and e is " + e);
        //  == (is equal to) operator
        System.err.println("d == e");   //false
        //  != (not equal to) operator
        System.err.println("d != e");    //true
        // > (greater than) operator 
        System.err.println("d > e");    //false
        //  < (less than) operator
        System.err.println("d < e");     //true
        // >= (greater than or equal to ) operator
        System.err.println("d >= e");    //false
        // <= (less than or equal to ) operator
        System.err.println("d <= e");    //true

        // Logical Operators
        //  && (logical AND)  true only if both expression are true.
        System.err.println((6 > 4) && (9 > 6));    //true
        System.err.println((6 > 4) && (9 < 6));    // false 

        //  || (logical OR) true either expression 1 or expression 2 is true.
        System.err.println((6 > 4) || (9 > 6));    //true
        System.err.println((6 > 4) || (9 > 6));    //true
        System.err.println((6 > 4) || (9 < 6));    // false 

        //  ! (logical NOT) true if expresion is false and viceversa.
        System.err.println(!(6 == 4));    //true
        System.err.println(!(6 > 4));    // false 

        // Unary Operators
        int f = 13, g = 13;
        int result1, result2;
        //  original value 
        System.err.println(" Value of f: " + f);
        //  + Unary plus ( not necessary to use since numbers are positive without using it)

        //  - Unary minus ( inverts the sign of an expression )
        //  ++ Increment operator (increment value by 1)
        result1 = ++f;
        System.err.println("After increment : " + result1);

        //  -- Decrement operator (decrement value by 1)
        result2 = --g;
        System.err.println("After decrement : " + result2);
        // ! Logical complement  operator (inverts the value of a boolean)

        // Bitwise Operators
        // Ternary Operator
    }
}
