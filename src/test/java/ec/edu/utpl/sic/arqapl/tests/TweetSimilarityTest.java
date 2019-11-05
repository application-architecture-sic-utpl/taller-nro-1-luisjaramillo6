package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;
import org.junit.Test;

public class TweetSimilarityTest {

    String tweet1 = "Hola mundo";
    String tweet2 = "Hola mundo";

    TweetSimilarity ts = new TweetSimilarity();

    public TweetSimilarityTest() {
    }

    @Test
    public void similarCosine() {
        assertEquals(1.0,
                ts.similarityCosine(tweet1, tweet2), 0.1);
    }

    @Test
    public void similarJaccard() {
        assertEquals(1.0,
                ts.similarityJaccard(tweet1, tweet2), 0.1);
    }

    @Test
    public void similarJaroWinckler() {
        assertEquals(1.0,
                ts.similarityJaroWinkler(tweet1, tweet2), 0.1);
    }
}
