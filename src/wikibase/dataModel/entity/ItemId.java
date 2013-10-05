package wikibase.dataModel.entity;

public class ItemId extends EntityId {
    public ItemId(String idSerialization) {
        super("item", idSerialization.toUpperCase());

        if (!this.serialization.matches("^Q[1-9][0-9]*$")) {
            throw new IllegalArgumentException("Invalid ItemId serialization provided");
        }
    }
}
