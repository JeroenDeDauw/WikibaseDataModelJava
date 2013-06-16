package wikibase.dataModel.snak;

import wikibase.dataModel.PropertyId;

public class PropertySomeValueSnak implements Snak {
    protected PropertyId propertyId;

    public PropertySomeValueSnak(PropertyId propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public PropertyId getPropertyId() {
        return this.propertyId;
    }

    @Override
    public String getType() {
        return "somevalue";
    }
}
