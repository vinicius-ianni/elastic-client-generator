
package org.elasticsearch.common_abstractions.infer.id;

import java.util.Objects;

public final class Id {
    private final String value;

    public Id(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Id that = (Id) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
