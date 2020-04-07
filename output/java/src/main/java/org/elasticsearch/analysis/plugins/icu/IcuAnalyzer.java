
package org.elasticsearch.analysis.plugins.icu;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.plugins.icu.normalization.*;

public class IcuAnalyzer  implements XContentable<IcuAnalyzer> {
  
  static final ParseField METHOD = new ParseField("method");
  private IcuNormalizationType _method;
  public IcuNormalizationType getMethod() { return this._method; }
  public IcuAnalyzer setMethod(IcuNormalizationType val) { this._method = val; return this; }


  static final ParseField MODE = new ParseField("mode");
  private IcuNormalizationMode _mode;
  public IcuNormalizationMode getMode() { return this._mode; }
  public IcuAnalyzer setMode(IcuNormalizationMode val) { this._mode = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IcuAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IcuAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IcuAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(IcuAnalyzer.class.getName(), false, args -> new IcuAnalyzer());

  static {
    PARSER.declareObject(IcuAnalyzer::setMethod, (p, t) -> IcuNormalizationType.PARSER.apply(p, null), METHOD);
    PARSER.declareObject(IcuAnalyzer::setMode, (p, t) -> IcuNormalizationMode.PARSER.apply(p, null), MODE);
  }

}
