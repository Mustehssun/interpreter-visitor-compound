package main.com.shady.grammar.combinationrules;

import main.com.shady.grammar.FilterRule;
import main.com.shady.grammar.NonTerminalSymbol;

import java.util.Arrays;

/*
    RuleAsText: [AND Rule] → [Filter Rule] <and> [Filter Rule]
 */
public class AndRule extends NonTerminalSymbol {

    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        String[] phrases = sentence.split("and");
        if(phrases.length < 2) {    //edge case
            return false;
        }
        return Arrays.stream(phrases).allMatch(phrase -> new FilterRule().interpret(phrase));
    }
}
