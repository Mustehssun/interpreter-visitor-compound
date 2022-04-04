package test;

import main.com.shady.grammar.baserules.MatchesRule;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MatchesRuleTest {
    @Test
    public void testRule() {
        MatchesRule rule = new MatchesRule();

        String validSentence = "equals autobots";
        assertTrue(rule.interpret(validSentence));

        String invalidSentence = "equals  ";
        assertFalse(rule.interpret(invalidSentence));
    }
}
