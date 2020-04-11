
package org.elasticsearch.modules.indices.fielddata;

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
import org.elasticsearch.modules.indices.fielddata.*;

public class Fielddata  implements XContentable<Fielddata> {
  
  static final ParseField FILTER = new ParseField("filter");
  private FielddataFilter _filter;
  public FielddataFilter getFilter() { return this._filter; }
  public Fielddata setFilter(FielddataFilter val) { this._filter = val; return this; }


  static final ParseField LOADING = new ParseField("loading");
  private FielddataLoading _loading;
  public FielddataLoading getLoading() { return this._loading; }
  public Fielddata setLoading(FielddataLoading val) { this._loading = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Fielddata fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Fielddata.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Fielddata, Void> PARSER =
    new ConstructingObjectParser<>(Fielddata.class.getName(), false, args -> new Fielddata());

  static {
    PARSER.declareObject(Fielddata::setFilter, (p, t) -> FielddataFilter.PARSER.apply(p, t), FILTER);
    PARSER.declareObject(Fielddata::setLoading, (p, t) -> FielddataLoading.PARSER.apply(p), LOADING);
  }

}
