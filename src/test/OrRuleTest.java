package test;

import main.com.shady.grammar.combinationrules.OrRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OrRuleTest {
    @Test
    public void testRule() {
        OrRule rule = new OrRule();

        String validSentence = "is required or equals autobots";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "requires or equals";
        assertFalse(rule.interpret(invalidSentence));
    }
}
