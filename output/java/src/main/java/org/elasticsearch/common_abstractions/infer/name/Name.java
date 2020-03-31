
package org.elasticsearch.common_abstractions.infer.name;

import java.util.Objects;

public final class Name {
    private final String value;

    public Name(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name that = (Name) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
