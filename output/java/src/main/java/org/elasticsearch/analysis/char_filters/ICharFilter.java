
package org.elasticsearch.analysis.char_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ICharFilter  implements XContentable<ICharFilter> {
  
  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public ICharFilter setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private String _version;
  public String getVersion() { return this._version; }
  public ICharFilter setVersion(String val) { this._version = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ICharFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ICharFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ICharFilter, Void> PARSER =
    new ConstructingObjectParser<>(ICharFilter.class.getName(), false, args -> new ICharFilter());

  static {
    PARSER.declareString(ICharFilter::setType, TYPE);
    PARSER.declareString(ICharFilter::setVersion, VERSION);
  }

}
