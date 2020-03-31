
package org.elasticsearch.common_abstractions.infer.long_id;

import java.util.Objects;

public final class LongId {
    private final String value;

    public LongId(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LongId that = (LongId) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
