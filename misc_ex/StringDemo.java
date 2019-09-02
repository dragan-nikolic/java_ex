/*
java string example

Here is excellent tutorial: https://www.tutorialspoint.com/java/java_strings.htm

The String class has 11 constructors that allow you to provide the initial value 
of the string using different sources, such as an array of characters.
*/
public class StringDemo {
    public static void ConstructFromArray() {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);  
        System.out.println( helloString );
    }

    public static void StringLengthEx() {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );
    }

    public static void ReplaceAllEx() {
        String original = 
            "SELECT DISTINCT\n" +
            "crm_act_st.email_subject AS ALIAS0,\n" +
            "crm_act_st.email_date AS ALIAS15,\n" +
            "crm_act_st.email_from AS ALIAS229\n" +
            "FROM\n" +
            "crm_act_st_vw crm_act_st\n" +
            "WHERE x=y :)";

        String modified = original.replaceAll(" AS ALIAS.*,", ",");
        modified = modified.replaceAll(" AS ALIAS\\d+", "");
        System.out.println("ORG: " + original);
        System.out.println("MOD: " + modified);

        System.out.println("*******************");
        modified = original
            .replaceAll(" AS ALIAS\\d+,", ",")
            .replaceAll(" AS ALIAS\\d+", "");
        System.out.println("MOD2: " + modified);
    }

    public static void main(String args[]) {
        // ConstructFromArray();
        // StringLengthEx();
        ReplaceAllEx();
    }
}
