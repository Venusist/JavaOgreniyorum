public class besstring {
    public static void main(String[] args){

        String txt = "ABCDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txxt = "Hello World";
        System.out.println(txxt.toUpperCase());
        System.out.println(txxt.toLowerCase());

        /*The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace): */

        String text = "Please locate where 'locate' occurs!";
        System.out.println(text.indexOf("locate"));
        
   }
}