package main.com.shady.grammar.baserules;

import main.com.shady.grammar.TerminalSymbol;

public class MaxLengthRule extends TerminalSymbol {
    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        String[] words = sentence.trim().split(" ");

        return words.length == 5 &&
                words[0].equals("has") &&
                words[1].equals("maximum") &&
                words[2].equals("length") &&
                words[3].equals("of");
    }
}
