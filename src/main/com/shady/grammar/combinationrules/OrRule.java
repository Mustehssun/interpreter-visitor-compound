package main.com.shady.grammar.combinationrules;

import main.com.shady.grammar.FilterRule;
import main.com.shady.grammar.NonTerminalSymbol;

import java.util.Arrays;

/*
    RuleAsText: [OR Rule] → [Filter Rule] <or> [Filter Rule]
 */
public class OrRule extends NonTerminalSymbol {
    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        String[] phrases = sentence.split("or");
        if(phrases.length < 2) {    //edge case
            return false;
        }
        return Arrays.stream(phrases).anyMatch(phrase -> new FilterRule().interpret(phrase));
    }
}
