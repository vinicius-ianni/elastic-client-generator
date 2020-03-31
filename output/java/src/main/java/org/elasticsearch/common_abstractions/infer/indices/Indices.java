
package org.elasticsearch.common_abstractions.infer.indices;

import java.util.Objects;

public final class Indices {
    private final String value;

    public Indices(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Indices that = (Indices) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
