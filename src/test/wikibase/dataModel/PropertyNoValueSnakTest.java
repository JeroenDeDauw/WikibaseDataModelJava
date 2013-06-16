package test.wikibase.dataModel;

import org.junit.Assert;
import org.junit.Test;
import wikibase.dataModel.PropertyId;
import wikibase.dataModel.PropertyNoValueSnak;

public class PropertyNoValueSnakTest {
    @Test
    public void assertCanConstruct() throws Exception {
        PropertyId id = new PropertyId("property", "p42");

        PropertyNoValueSnak snak = new PropertyNoValueSnak( id );

        Assert.assertEquals(snak.getPropertyId(), id);
    }
}
