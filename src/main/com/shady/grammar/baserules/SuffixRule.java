package main.com.shady.grammar.baserules;

import main.com.shady.grammar.TerminalSymbol;

public class SuffixRule extends TerminalSymbol {
    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        String[] phrases = sentence.trim().split(" ");

        return phrases.length == 3 && phrases[0].equals("ends") && phrases[1].equals("with");
    }
}
