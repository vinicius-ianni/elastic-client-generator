
package org.elasticsearch.ingest.simulate_pipeline;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class Ingest  implements XContentable<Ingest> {
  
  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public Ingest setTimestamp(Date val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Ingest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Ingest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Ingest, Void> PARSER =
    new ConstructingObjectParser<>(Ingest.class.getName(), false, args -> new Ingest());

  static {
    PARSER.declareDate(Ingest::setTimestamp, (p, t) -> Date.createFrom(p), TIMESTAMP);
  }

}
