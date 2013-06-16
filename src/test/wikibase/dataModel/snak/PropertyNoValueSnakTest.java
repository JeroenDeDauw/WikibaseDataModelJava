package test.wikibase.dataModel.snak;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.PropertyId;
import wikibase.dataModel.snak.PropertyNoValueSnak;

public class PropertyNoValueSnakTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId("p42");

        PropertyNoValueSnak snak = new PropertyNoValueSnak( id );

        Assert.assertEquals(snak.getPropertyId(), id);
    }
}
