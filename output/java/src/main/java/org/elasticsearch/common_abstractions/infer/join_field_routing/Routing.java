
package org.elasticsearch.common_abstractions.infer.join_field_routing;

import java.util.Objects;

public final class Routing {
    private final String value;

    public Routing(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Routing that = (Routing) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
