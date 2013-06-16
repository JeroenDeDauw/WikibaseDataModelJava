package test.wikibase.dataModel.claim;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.claim.Rank;
import wikibase.dataModel.claim.ReferenceList;
import wikibase.dataModel.claim.Statement;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;
import wikibase.dataModel.snak.SnakList;

public class StatementTest {
    @Test
    public void assertCanConstructWithAllArguments() throws Exception {
        PropertyNoValueSnak mainSnak = new PropertyNoValueSnak(new PropertyId("p42"));
        SnakList qualifiers = new SnakList();
        ReferenceList references = new ReferenceList();
        Rank rank = Rank.DEPRECATED;

        Statement claim = new Statement(mainSnak, qualifiers, references, rank);

        Assert.assertEquals(claim.getMainSnak(), mainSnak);
        Assert.assertEquals(claim.getQualifiers(), qualifiers);
        Assert.assertEquals(claim.getReferences(), references);
        Assert.assertEquals(claim.getRank(), rank);
    }
}
