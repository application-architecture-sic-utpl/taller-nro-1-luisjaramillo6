/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.sic.arqapl.metrics;
import org.apache.commons.text.similarity.JaroWinklerDistance;
/**
 *
 * @author luis
 */
public class JaroWinkler implements Similaritable{
    
    @Override
    public double similarity(String text1, String text2) {
        JaroWinklerDistance jaro = new JaroWinklerDistance();
        double similarity = 1.0 - jaro.apply(text1, text2);
        return similarity;
    }
}
