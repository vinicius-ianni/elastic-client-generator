
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.token_filters.*;

public class KeepTypesTokenFilter  implements XContentable<KeepTypesTokenFilter> {
  
  static final ParseField MODE = new ParseField("mode");
  private KeepTypesMode _mode;
  public KeepTypesMode getMode() { return this._mode; }
  public KeepTypesTokenFilter setMode(KeepTypesMode val) { this._mode = val; return this; }


  static final ParseField TYPES = new ParseField("types");
  private List<String> _types;
  public List<String> getTypes() { return this._types; }
  public KeepTypesTokenFilter setTypes(List<String> val) { this._types = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KeepTypesTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KeepTypesTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KeepTypesTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(KeepTypesTokenFilter.class.getName(), false, args -> new KeepTypesTokenFilter());

  static {
    PARSER.declareObject(KeepTypesTokenFilter::setMode, (p, t) -> KeepTypesMode.PARSER.apply(p, null), MODE);
    PARSER.declareStringArray(KeepTypesTokenFilter::setTypes, TYPES);
  }

}
