public class sekiz {
    public static void main(String[] args){

/*
        Escape character	Result	Description
            \'	                '	Single quote
            \"	                "	Double quote
            \\	                \	Backslash       */
        
        String txt = "We are the so-called \"Vikings\" from the north.";
        String text= "It\'s alright.";
        String txxt = "The character \\ is called backslash.";
        System.out.println("first " + txt + "second " + text + "third " + txxt);

/*
Other common escape sequences that are valid in Java are:
Code	Result	
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed
 */
    }
    
}
