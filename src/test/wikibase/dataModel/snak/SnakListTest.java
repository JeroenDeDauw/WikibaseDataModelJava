package test.wikibase.dataModel.snak;

import org.junit.Test;
import wikibase.dataModel.entity.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;
import wikibase.dataModel.snak.Snak;
import wikibase.dataModel.snak.SnakList;

import static org.junit.Assert.assertEquals;

public class SnakListTest {
    @Test
    public void assertCanConstruct() throws Exception {
        SnakList snaks = new SnakList();
    }

    @Test
    public void assertCanAddSnaks() throws Exception {
        SnakList snaks = new SnakList();

        Snak firstSnak = new PropertyNoValueSnak(new PropertyId("p42"));
        Snak secondSnak = new PropertyNoValueSnak(new PropertyId("p43"));

        snaks.add(firstSnak);
        snaks.add(secondSnak);

        assertEquals(snaks.size(), 2);
        assertEquals(snaks.get(0), firstSnak);
        assertEquals(snaks.get(1), secondSnak);
    }
}
