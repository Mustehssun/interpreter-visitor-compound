package main.com.shady.grammar.baserules;

import main.com.shady.grammar.TerminalSymbol;

/*
    RuleAsText: [Matches Rule] → <equals> <string>
 */
public class MatchesRule extends TerminalSymbol {
    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        String[] words = sentence.trim().split(" ");

        return words.length == 2 && words[0].equals("equals");
    }
}
