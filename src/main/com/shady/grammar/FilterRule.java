package main.com.shady.grammar;

import main.com.shady.grammar.baserules.BaseRule;
import main.com.shady.grammar.combinationrules.CombinationRule;

/**
 * RuleAsText: [FilterRule] -> [BaseRule] | [CombinationRule]
 */
public class FilterRule extends NonTerminalSymbol {

    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        return new BaseRule().interpret(sentence) || new CombinationRule().interpret(sentence);
    }
}
