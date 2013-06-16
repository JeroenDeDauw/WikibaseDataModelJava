package test.wikibase.dataModel.claim;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.claim.Claim;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;
import wikibase.dataModel.snak.SnakList;

public class ClaimTest {
    @Test
    public void assertCanConstructWithOnlyAMainSnak() throws Exception {
        PropertyNoValueSnak mainSnak = new PropertyNoValueSnak(new PropertyId("p42"));

        Claim claim = new Claim(mainSnak);

        Assert.assertEquals(claim.getMainSnak(), mainSnak);
    }

    @Test
    public void assertCanConstructWithQualifiers() throws Exception {
        PropertyNoValueSnak mainSnak = new PropertyNoValueSnak(new PropertyId("p42"));
        SnakList qualifiers = new SnakList();

        Claim claim = new Claim(mainSnak, qualifiers);

        Assert.assertEquals(claim.getMainSnak(), mainSnak);
        Assert.assertEquals(claim.getQualifiers(), qualifiers);
    }

    @Test
    public void assertGetRank() throws Exception {
        Claim claim = new Claim(new PropertyNoValueSnak(new PropertyId("p42")));

        Assert.assertEquals(claim.getRank(), Rank.TRUTH);
    }
}
