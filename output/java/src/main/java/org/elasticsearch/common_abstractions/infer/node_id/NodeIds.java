
package org.elasticsearch.common_abstractions.infer.node_id;

import java.util.Objects;

public final class NodeIds {
    private final String value;

    public NodeIds(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NodeIds that = (NodeIds) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
