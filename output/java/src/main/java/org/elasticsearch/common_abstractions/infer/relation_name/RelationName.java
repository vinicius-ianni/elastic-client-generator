
package org.elasticsearch.common_abstractions.infer.relation_name;

import java.util.Objects;

public final class RelationName {
    private final String value;

    public RelationName(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RelationName that = (RelationName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
