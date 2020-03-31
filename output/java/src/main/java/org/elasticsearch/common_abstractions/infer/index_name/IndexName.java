
package org.elasticsearch.common_abstractions.infer.index_name;

import java.util.Objects;

public final class IndexName {
    private final String value;

    public IndexName(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IndexName that = (IndexName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
