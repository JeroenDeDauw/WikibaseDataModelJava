package test.wikibase.dataModel.claim;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.claim.Claim;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;

public class ClaimTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyNoValueSnak mainSnak = new PropertyNoValueSnak(new PropertyId("p42"));

        Claim claim = new Claim(mainSnak);

        Assert.assertEquals(claim.getMainSnak(), mainSnak);
    }
}
