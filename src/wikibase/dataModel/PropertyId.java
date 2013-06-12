package wikibase.dataModel;

public class PropertyId extends EntityId {
    public PropertyId(String entityType, String idSerialization) {
        super(entityType, idSerialization);

        if (!entityType.equals("property")) {
            throw new IllegalArgumentException("Cannot construct a PropertyId with an entity type that is not 'property'");
        }
    }
}
