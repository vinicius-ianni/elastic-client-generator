package org.elasticsearch.search.search

import org.elasticsearch.NamedContainer
import org.elasticsearch.aggregations.AggregationContainer
import org.elasticsearch.common_abstractions.infer.field.Field
import org.elasticsearch.query_dsl.abstractions.container.QueryContainer
import org.elasticsearch.query_dsl.term_level.term.TermQuery

class SearchRequestTest {
  public void Demo() {
    SearchRequest request = new SearchRequest()
      .setQuery()
      .setFrom(12)
      .setQuery(new QueryContainer()
        .setTerm(new TermQuery()
          .setValue("term")
          .setField(new Field("x")) as TermQuery
        )
      )
      .setAggs(new NamedContainer<String, AggregationContainer>())
      .setSize(40);
  }
}
