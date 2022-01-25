public class SubSeq {
    public static void main(String[] args){
        subSeq("", "abc");
    }

// Print all the possible subset/subsequences possible
// given="abc" => Output: "a", "b", "c", "ab", "bc", "ac", "abc"

    static void subSeq(String ans, String given){
        // when the given string becomes empty just print the ans
        if(given.isEmpty()){
            System.out.print(ans + ", ");
            return;
        }

        char c = given.charAt(0);

        // Making two Recusive calls either to take the char c in ans string or ignore it
        subSeq(ans, given.substring(1));
        subSeq(ans+c, given.substring(1));
    }
    
}
