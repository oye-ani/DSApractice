public class SkipCharr {
    public static void main(String[] args){
        skip("", "baccdah");
    }
    
    // Problem: for a given string return another string made by skipping all the characters 'a' from it.
    
    static void skip(String ans, String given){
    //    when the actual given string becomes empty print and return.
        if(given.isEmpty()){
            System.out.println(ans);
            return;
        }

        char c = given.charAt(0);

        if( c=='a' ){
            skip(ans, given.substring(1));
        }else{
            ans= ans + c;   // if c!=a then add/concatenate that character to ans string
            skip(ans, given.substring(1));    //using substring method of String class and passing index value =1
        }
    }
}
