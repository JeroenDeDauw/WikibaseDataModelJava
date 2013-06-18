package wikibase.dataModel.claim;

import wikibase.dataModel.reference.ReferenceList;
import wikibase.dataModel.snak.Snak;
import wikibase.dataModel.snak.SnakList;

public class Statement extends Claim {
    private final ReferenceList references;

    private final Rank rank;

    public Statement(Snak mainSnak, SnakList qualifiers, ReferenceList references, Rank rank) {
        super(mainSnak, qualifiers);
        this.references = references;
        this.rank = rank;
    }

    public ReferenceList getReferences() {
        return references;
    }

    public Rank getRank() {
        return rank;
    }
}
