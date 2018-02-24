import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailRegex {
	
	private static Pattern emailNamePtrn = Pattern.compile(
"^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
			
		
    public static boolean validateEmailAddress(String pUserEmail){
        Matcher mtch = emailNamePtrn.matcher(pUserEmail);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
			 
//    public static void main(String a[]){
//        System.out.println("Is 'java2novice@gmail.com' a valid email address? "
//                                    +validateEmailAddress("java2novice@gmail.com"));
//        System.out.println("Is 'cric*7*&@yahoo.com' a valid email address? "
//                                    +validateEmailAddress("cric*7*&@yahoo.com"));
//        System.out.println("Is 'JAVA2NOVICE.gmail.com' a valid email address? "
//                                    +validateEmailAddress("JAVA2NOVICE.gmail.com"));
//    }    
}