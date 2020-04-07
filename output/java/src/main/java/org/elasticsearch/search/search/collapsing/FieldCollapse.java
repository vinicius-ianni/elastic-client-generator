
package org.elasticsearch.search.search.collapsing;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.search.search.inner_hits.*;
import org.elasticsearch.internal.*;

public class FieldCollapse  implements XContentable<FieldCollapse> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public FieldCollapse setField(Field val) { this._field = val; return this; }


  static final ParseField INNER_HITS = new ParseField("inner_hits");
  private InnerHits _innerHits;
  public InnerHits getInnerHits() { return this._innerHits; }
  public FieldCollapse setInnerHits(InnerHits val) { this._innerHits = val; return this; }


  static final ParseField MAX_CONCURRENT_GROUP_SEARCHES = new ParseField("max_concurrent_group_searches");
  private Integer _maxConcurrentGroupSearches;
  public Integer getMaxConcurrentGroupSearches() { return this._maxConcurrentGroupSearches; }
  public FieldCollapse setMaxConcurrentGroupSearches(Integer val) { this._maxConcurrentGroupSearches = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FieldCollapse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldCollapse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldCollapse, Void> PARSER =
    new ConstructingObjectParser<>(FieldCollapse.class.getName(), false, args -> new FieldCollapse());

  static {
    PARSER.declareField(FieldCollapse::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObject(FieldCollapse::setInnerHits, (p, t) -> InnerHits.PARSER.apply(p, null), INNER_HITS);
    PARSER.declareInteger(FieldCollapse::setMaxConcurrentGroupSearches, MAX_CONCURRENT_GROUP_SEARCHES);
  }

}
