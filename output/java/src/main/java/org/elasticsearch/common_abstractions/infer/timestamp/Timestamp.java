
package org.elasticsearch.common_abstractions.infer.timestamp;

import java.util.Objects;

public final class Timestamp {
    private final String value;

    public Timestamp(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Timestamp that = (Timestamp) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
