package main.com.shady.grammar.baserules;

import main.com.shady.grammar.NonTerminalSymbol;

/*
    RuleAsText: [Base Rules] → [Required rule] | [String Rule] | [Number Rule] | [Matches Rule] | [Min Length Rule] |
    [Max Length Rule] | [Prefix Rule] | [Suffix Rule]
 */
public class BaseRule extends NonTerminalSymbol {

    @Override
    public Boolean interpret(String sentence) {
        if(sentence == null) {  //edge case
            return false;
        }
        return new RequiredRule().interpret(sentence) ||
                new MatchesRule().interpret(sentence) ||
                new PrefixRule().interpret(sentence) ||
                new SuffixRule().interpret(sentence) ||
                new MinLengthRule().interpret(sentence) ||
                new MaxLengthRule().interpret(sentence);
    }
}
