
package org.elasticsearch.analysis.analyzers;

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


public class AnalyzerBase  implements XContentable<AnalyzerBase> {
  
  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public AnalyzerBase setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private String _version;
  public String getVersion() { return this._version; }
  public AnalyzerBase setVersion(String val) { this._version = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.field(TYPE.getPreferredName(), _type);
    builder.field(VERSION.getPreferredName(), _version);
    return builder;
  }

  @Override
  public AnalyzerBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AnalyzerBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AnalyzerBase, Void> PARSER =
    new ConstructingObjectParser<>(AnalyzerBase.class.getName(), false, args -> new AnalyzerBase());

  static {
    PARSER.declareString(AnalyzerBase::setType, TYPE);
    PARSER.declareString(AnalyzerBase::setVersion, VERSION);
  }

}
