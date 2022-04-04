package test;

import main.com.shady.grammar.combinationrules.AndRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AndRuleTest {
    @Test
    public void testRule() {
        AndRule rule = new AndRule();

        String validSentence = "is required and equals autobots";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "is required and equals";
        assertFalse(rule.interpret(invalidSentence));
    }
}
