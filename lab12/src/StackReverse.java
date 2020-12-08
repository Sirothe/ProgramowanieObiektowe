import java.util.Stack;

public class StackReverse {
    public static String stackReverse(String text){
        String[] words= text.split(" ");
        Stack<String> tempStack= new Stack<>();
        StringBuilder reverse= new StringBuilder();
        for(String word: words){
            tempStack.push(word);
            if(word.endsWith(".")){
                while(!tempStack.empty()){
                    StringBuilder reversed_word = new StringBuilder();
                    reversed_word.append(tempStack.pop());
                    if(tempStack.empty()){
                        reversed_word.setCharAt(0,Character.toLowerCase(reversed_word.charAt(0)));
                        reverse.append(reversed_word);
                        reverse.append(". ");
                    }
                    else if(reversed_word.toString().equals(word)){
                        reversed_word.setCharAt(0,Character.toUpperCase(reversed_word.charAt(0)));
                        reverse.append(reversed_word, 0, reversed_word.length()-1);
                        reverse.append(" ");
                    }
                    else{
                        reverse.append(reversed_word);
                        reverse.append(" ");
                    }
                }
            }
        }
        return reverse.toString();
    }
}
