package main.com.shady.grammar.combinationrules;

import main.com.shady.grammar.NonTerminalSymbol;

/*
    RuleAsText: [Combination Rule] → [AND Rule] | [OR Rule]
 */
public class CombinationRule extends NonTerminalSymbol {
    private final AndRule andRule = new AndRule();
    private final OrRule orRule = new OrRule();

    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {
            return false;
        }
        return andRule.interpret(sentence) || orRule.interpret(sentence);
    }
}
