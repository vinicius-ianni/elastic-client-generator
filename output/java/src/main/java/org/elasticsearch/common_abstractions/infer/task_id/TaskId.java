
package org.elasticsearch.common_abstractions.infer.task_id;

import java.util.Objects;

public final class TaskId {
    private final String value;

    public TaskId(String value) { this.value = value; }

    @Override
    public String toString() { return value.toString(); }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TaskId that = (TaskId) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() { return Objects.hash(value); }
}
