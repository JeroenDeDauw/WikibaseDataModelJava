package test.wikibase.dataModel.reference;

import org.junit.Test;
import wikibase.dataModel.reference.Reference;
import wikibase.dataModel.reference.ReferenceList;

import static org.junit.Assert.assertEquals;

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

        assertEquals(references.size(), 2);
        assertEquals(references.get(0), firstReference);
        assertEquals(references.get(1), secondReference);
    }
}
