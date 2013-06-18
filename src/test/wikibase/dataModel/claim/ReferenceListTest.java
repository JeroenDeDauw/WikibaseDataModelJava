package test.wikibase.dataModel.claim;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.claim.Reference;
import wikibase.dataModel.claim.ReferenceList;

public class ReferenceListTest {
    @Test
    public void assertCanConstruct() throws Exception {
        ReferenceList references = new ReferenceList();
    }

    @Test
    public void assertCanAddReferences() throws Exception {
        Reference firstReference = new Reference();
        Reference secondReference = new Reference();

        ReferenceList references = new ReferenceList();
        references.add(firstReference);
        references.add(secondReference);

        Assert.assertEquals(references.size(), 2);
        Assert.assertEquals(references.get(0), firstReference);
        Assert.assertEquals(references.get(1), secondReference);
    }
}
