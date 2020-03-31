
package org.elasticsearch.common_abstractions.infer.property_name;

import java.util.Objects;

public final class PropertyName {
    private final String value;

    public PropertyName(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PropertyName that = (PropertyName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
