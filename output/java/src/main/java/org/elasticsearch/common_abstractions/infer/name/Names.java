
package org.elasticsearch.common_abstractions.infer.name;

import java.util.Objects;

public final class Names {
    private final String value;

    public Names(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Names that = (Names) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
