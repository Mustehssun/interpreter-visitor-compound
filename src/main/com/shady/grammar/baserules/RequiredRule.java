package main.com.shady.grammar.baserules;

import main.com.shady.grammar.TerminalSymbol;

/*
    RuleAsText: [Required Rule] → <is> <required>
 */
public class RequiredRule extends TerminalSymbol {
    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {    //edge case
            return false;
        }
        String[] words = sentence.trim().split(" ");

        return words.length == 2 && words[0].equals("is") && words[1].equals("required");
    }
}
