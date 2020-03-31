
package org.elasticsearch.internal;

import java.util.Objects;

public final class TimeSpan {
    private final String value;

    public TimeSpan(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TimeSpan that = (TimeSpan) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
