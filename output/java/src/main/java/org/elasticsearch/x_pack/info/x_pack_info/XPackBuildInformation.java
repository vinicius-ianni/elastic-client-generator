
package org.elasticsearch.x_pack.info.x_pack_info;

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
import org.elasticsearch.internal.*;

public class XPackBuildInformation  implements XContentable<XPackBuildInformation> {
  
  static final ParseField DATE = new ParseField("date");
  private Date _date;
  public Date getDate() { return this._date; }
  public XPackBuildInformation setDate(Date val) { this._date = val; return this; }


  static final ParseField HASH = new ParseField("hash");
  private String _hash;
  public String getHash() { return this._hash; }
  public XPackBuildInformation setHash(String val) { this._hash = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public XPackBuildInformation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return XPackBuildInformation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<XPackBuildInformation, Void> PARSER =
    new ConstructingObjectParser<>(XPackBuildInformation.class.getName(), false, args -> new XPackBuildInformation());

  static {
    PARSER.declareObject(XPackBuildInformation::setDate, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), DATE);
    PARSER.declareString(XPackBuildInformation::setHash, HASH);
  }

}
