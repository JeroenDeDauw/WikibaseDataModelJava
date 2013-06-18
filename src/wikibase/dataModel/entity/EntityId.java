package wikibase.dataModel.entity;

abstract public class EntityId {
    protected String entityType;
    protected String serialization;

    public EntityId(String entityType, String idSerialization) {
        this.entityType = entityType;
        this.serialization = idSerialization;
    }

    public String getEntityType() {
        return entityType;
    }

    public String getSerialization() {
        return serialization;
    }
}
