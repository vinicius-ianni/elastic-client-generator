
package org.elasticsearch.common;

public enum SearchType {
  QueryThenFetch("query_then_fetch"),
    DfsQueryThenFetch("dfs_query_then_fetch");
  private final String textRepresentation;

  private SearchType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
