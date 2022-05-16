// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
   	    // Complete the program code here:
         String word = args[0];
        int repeat = Integer.parseInt(args[1]);
        int i = 0;
        String vowels = "aeiouAEIOU";
        while (i < word.length()) {
            System.out.print("Give me");
            char c = word.charAt(i);
            if(vowels.indexOf(c) == -1){
                System.out.print(" a " + word.charAt(i) + ": " + word.charAt(i) + "!");
            }
            else{
                System.out.print(" an " + word.charAt(i) + ":" + word.charAt(i) + "!");
            }
            System.out.println();
            i++;
                      
        }
        System.out.println("What does that spell?");
        int k = 0;
        while (k < repeat){
            System.out.println(args[0] + "!!!");
            k++;
        }
    }
}
