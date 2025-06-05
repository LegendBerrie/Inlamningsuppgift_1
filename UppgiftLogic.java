package Uppgift_1;

public class UppgiftLogic {

    private int rows;
    private int chars;
    private int countWords;
    private String longestWord;
    private String allText = "";

    public UppgiftLogic() {
        longestWord = "";
    }

    public int getRows() {
        return rows;
    }

    public int getChars() {
        return chars;
    }

    public void addText(String newInput) {

        if (newInput.toLowerCase().trim().equals("stopp")) {
           return;
        }
        rows++;
        chars += newInput.length();
        allText = allText + newInput + " ";
        countWords(allText);
    }

    public void countWords(String text){
        String[] words = text.trim().split("\\s+");

        if (text.trim().isEmpty()) {
            countWords = 0;
        } else {
            countWords = words.length;
        }
    }

    public int getWords () {
        return countWords;
    }

    public void setLongestWord(String text) {
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }

}