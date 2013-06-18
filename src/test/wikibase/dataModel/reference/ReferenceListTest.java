package test.wikibase.dataModel.reference;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.reference.Reference;
import wikibase.dataModel.reference.ReferenceList;

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
