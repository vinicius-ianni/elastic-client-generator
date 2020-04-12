
package org.elasticsearch.search.field_capabilities;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_abstractions.infer.indices.*;

public class FieldCapabilities  implements XContentable<FieldCapabilities> {
  
  static final ParseField AGGREGATABLE = new ParseField("aggregatable");
  private Boolean _aggregatable;
  public Boolean getAggregatable() { return this._aggregatable; }
  public FieldCapabilities setAggregatable(Boolean val) { this._aggregatable = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public FieldCapabilities setIndices(Indices val) { this._indices = val; return this; }


  static final ParseField NON_AGGREGATABLE_INDICES = new ParseField("non_aggregatable_indices");
  private Indices _nonAggregatableIndices;
  public Indices getNonAggregatableIndices() { return this._nonAggregatableIndices; }
  public FieldCapabilities setNonAggregatableIndices(Indices val) { this._nonAggregatableIndices = val; return this; }


  static final ParseField NON_SEARCHABLE_INDICES = new ParseField("non_searchable_indices");
  private Indices _nonSearchableIndices;
  public Indices getNonSearchableIndices() { return this._nonSearchableIndices; }
  public FieldCapabilities setNonSearchableIndices(Indices val) { this._nonSearchableIndices = val; return this; }


  static final ParseField SEARCHABLE = new ParseField("searchable");
  private Boolean _searchable;
  public Boolean getSearchable() { return this._searchable; }
  public FieldCapabilities setSearchable(Boolean val) { this._searchable = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(AGGREGATABLE.getPreferredName(), _aggregatable);
    if (_indices != null) {
      builder.field(INDICES.getPreferredName());
      _indices.toXContent(builder, params);
    }
    if (_nonAggregatableIndices != null) {
      builder.field(NON_AGGREGATABLE_INDICES.getPreferredName());
      _nonAggregatableIndices.toXContent(builder, params);
    }
    if (_nonSearchableIndices != null) {
      builder.field(NON_SEARCHABLE_INDICES.getPreferredName());
      _nonSearchableIndices.toXContent(builder, params);
    }
    builder.field(SEARCHABLE.getPreferredName(), _searchable);
    builder.endObject();
    return builder;
  }

  @Override
  public FieldCapabilities fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldCapabilities.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldCapabilities, Void> PARSER =
    new ConstructingObjectParser<>(FieldCapabilities.class.getName(), false, args -> new FieldCapabilities());

  static {
    PARSER.declareBoolean(FieldCapabilities::setAggregatable, AGGREGATABLE);
    PARSER.declareObject(FieldCapabilities::setIndices, (p, t) -> Indices.createFrom(p), INDICES);
    PARSER.declareObject(FieldCapabilities::setNonAggregatableIndices, (p, t) -> Indices.createFrom(p), NON_AGGREGATABLE_INDICES);
    PARSER.declareObject(FieldCapabilities::setNonSearchableIndices, (p, t) -> Indices.createFrom(p), NON_SEARCHABLE_INDICES);
    PARSER.declareBoolean(FieldCapabilities::setSearchable, SEARCHABLE);
  }

}
