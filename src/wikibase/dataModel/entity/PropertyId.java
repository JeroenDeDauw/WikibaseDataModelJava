package wikibase.dataModel.entity;

public class PropertyId extends EntityId {
    public PropertyId(String idSerialization) {
        super("property", idSerialization.toUpperCase());

        if (!this.serialization.matches("^P[1-9][0-9]*$")) {
            throw new IllegalArgumentException("Invalid PropertyId serialization provided");
        }
    }
}
