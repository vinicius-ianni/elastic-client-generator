
package org.elasticsearch.search.search.rescoring;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.search.rescoring.*;
import org.elasticsearch.internal.*;

public class Rescore  implements XContentable<Rescore> {
  
  static final ParseField QUERY = new ParseField("query");
  private RescoreQuery _query;
  public RescoreQuery getQuery() { return this._query; }
  public Rescore setQuery(RescoreQuery val) { this._query = val; return this; }


  static final ParseField WINDOW_SIZE = new ParseField("window_size");
  private Integer _windowSize;
  public Integer getWindowSize() { return this._windowSize; }
  public Rescore setWindowSize(Integer val) { this._windowSize = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Rescore fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Rescore.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Rescore, Void> PARSER =
    new ConstructingObjectParser<>(Rescore.class.getName(), false, args -> new Rescore());

  static {
    PARSER.declareObject(Rescore::setQuery, (p, t) -> RescoreQuery.PARSER.apply(p, null), QUERY);
    PARSER.declareInteger(Rescore::setWindowSize, WINDOW_SIZE);
  }

}
