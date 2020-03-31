
package org.elasticsearch.common_abstractions.infer.metrics;

import java.util.Objects;

public final class IndexMetrics {
    private final String value;

    public IndexMetrics(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IndexMetrics that = (IndexMetrics) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
