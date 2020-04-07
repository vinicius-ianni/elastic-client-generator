
package org.elasticsearch.analysis.tokenizers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ITokenizer  implements XContentable<ITokenizer> {
  
  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public ITokenizer setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private String _version;
  public String getVersion() { return this._version; }
  public ITokenizer setVersion(String val) { this._version = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ITokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ITokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ITokenizer, Void> PARSER =
    new ConstructingObjectParser<>(ITokenizer.class.getName(), false, args -> new ITokenizer());

  static {
    PARSER.declareString(ITokenizer::setType, TYPE);
    PARSER.declareString(ITokenizer::setVersion, VERSION);
  }

}
