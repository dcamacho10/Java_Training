package WordTool;

public class WordTool {

    WordTool(){

    }
    /**
     *Method to count the number of word in a text.
     * @param text text to be analyzed
     * @return the number of word in a text
     */

    public int wordCount(String text){
        int count = 0;

        if(!(text == null || text.isEmpty())){
            String[] wordsWithWhiteSpace = text.split("\s+");
            count = wordsWithWhiteSpace.length;
        }

        return count;
    }

    /**
     *Method to count the number of characters in a text.
     * @param text text to be analyzed
     * @param withWhiteSpace choose if the white spaces will be counted
     * @return the number of characters
     */

    public int symbolCount(String text, Boolean withWhiteSpace){
        int count = 0;
        if(!(text == null || text.isEmpty())){
            if(withWhiteSpace){
                count = text.length();
            }else{
                count = text.replace(" ", "").length();
            }
        }

        return count;
    }
}