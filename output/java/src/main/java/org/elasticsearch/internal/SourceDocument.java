
package org.elasticsearch.internal;

import java.util.Objects;

public final class SourceDocument {
    private final Object value;

    public SourceDocument(String value) { this.value = value; }

    @Override
    public Object toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SourceDocument that = (SourceDocument) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
