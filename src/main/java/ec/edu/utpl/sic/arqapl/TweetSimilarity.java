package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.*;

public class TweetSimilarity {

    private Similaritable algoritmoCosine;
    private Similaritable algoritmoJaccard;
    private Similaritable algoritmoJaraWinkler;

    public TweetSimilarity() {
        algoritmoCosine = new Cosine();
        algoritmoJaccard = new Jaccard();
        algoritmoJaraWinkler = new JaroWinkler();
    }

    /*public TweetSimilarity(Similaritable algorithm) {
        this.algoritmoJaccard = algorithm;
    }*/
    
    public double similarityCosine(String tweet1, String tweet2) {
        return algoritmoCosine.similarity(tweet1, tweet2);
    }
    public double similarityJaccard(String tweet1, String tweet2) {
        return algoritmoJaccard.similarity(tweet1, tweet2);
    }
    
    public double similarityJaroWinkler(String tweet1, String tweet2) {
        return algoritmoJaraWinkler.similarity(tweet1, tweet2);
    }
}
