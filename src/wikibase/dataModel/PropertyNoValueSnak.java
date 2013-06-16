package wikibase.dataModel;

public class PropertyNoValueSnak implements Snak {
    protected PropertyId propertyId;

    public PropertyNoValueSnak(PropertyId propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public PropertyId getPropertyId() {
        return this.propertyId;
    }

    @Override
    public String getType() {
        return "novalue";
    }
}
