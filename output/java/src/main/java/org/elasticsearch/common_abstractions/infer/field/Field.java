
package org.elasticsearch.common_abstractions.infer.field;

import java.util.Objects;

public final class Field {
    private final String value;

    public Field(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Field that = (Field) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
