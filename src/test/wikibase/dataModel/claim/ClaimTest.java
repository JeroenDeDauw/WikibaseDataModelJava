package test.wikibase.dataModel.claim;

import org.junit.Test;
import wikibase.dataModel.claim.Claim;
import wikibase.dataModel.claim.Rank;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;
import wikibase.dataModel.snak.SnakList;

import static org.junit.Assert.assertEquals;

public class ClaimTest {
    @Test
    public void assertCanConstructWithOnlyAMainSnak() throws Exception {
        PropertyNoValueSnak mainSnak = new PropertyNoValueSnak(new PropertyId("p42"));

        Claim claim = new Claim(mainSnak);

        assertEquals(claim.getMainSnak(), mainSnak);
    }

    @Test
    public void assertCanConstructWithQualifiers() throws Exception {
        PropertyNoValueSnak mainSnak = new PropertyNoValueSnak(new PropertyId("p42"));
        SnakList qualifiers = new SnakList();

        Claim claim = new Claim(mainSnak, qualifiers);

        assertEquals(claim.getMainSnak(), mainSnak);
        assertEquals(claim.getQualifiers(), qualifiers);
    }

    @Test
    public void assertGetRank() throws Exception {
        Claim claim = new Claim(new PropertyNoValueSnak(new PropertyId("p42")));

        assertEquals(claim.getRank(), Rank.TRUTH);
    }
}
