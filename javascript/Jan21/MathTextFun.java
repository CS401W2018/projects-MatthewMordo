package Jan21;

public class MathTextFun {
    
    public static void main(String[] args) {
        System.out.println("Plus Operator!");
        final int RESULT = 5 + 8;
        System.out.println("Result is: " + (RESULT + 10));

        System.out.println("Subtraction Operator!");
        int result2 = 5 - 8;
        System.out.println("Result is: " + result2);
        
        System.out.println("Multiplication Operator!");
        int result3 = 5 * 8;
        System.out.println("Result is: " + result3);

        System.out.println("Division Operator!");
        int result4 = 5 / 8;
        System.out.println("Result is: " + result4);

        System.out.println("Remainder Operator!");
        int result5 = 5 %  8;
        System.out.println("Result is: " + result5);

        double division = (double)42 / 5; // Int / Int
        System.out.println("Result is: " + division);

        int i = (int) (42.1569789 / 5.556845);
        System.out.println("result is: " + i);

        String String = "\"long\"";
        System.out.println(String);

        String textBlock = """
                
            Dear CS202,
            Today I decided to write this block of text that will have so many wonderful
            punctuations! Like the \\*
            Now I know it's not going to be that "long" but that's okay as long as we get
            the gist/concept/ideas (things) of what is going on.
            Yours Truely "Magnífico fo'i talavou fie mohea
            faiako"
            Knowlton 'Ita'aehau

        """;
        System.out.println(textBlock);
    }
}
