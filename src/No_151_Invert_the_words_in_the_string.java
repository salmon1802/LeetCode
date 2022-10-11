

public class No_151_Invert_the_words_in_the_string {
    public String reverseWords(String s) {
       s.trim();
       String[] temp = s.split("\\s+");
       StringBuilder sb = new StringBuilder();
       for (int i = temp.length - 1; i >= 0; i--) {
           sb.append(temp[i] + " ");
       }
       return sb.toString().trim();
    }
}
