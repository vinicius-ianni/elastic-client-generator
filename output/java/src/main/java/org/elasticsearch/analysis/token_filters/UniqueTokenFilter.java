
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




public class UniqueTokenFilter  implements XContentable<UniqueTokenFilter> {
  
  static final ParseField ONLY_ON_SAME_POSITION = new ParseField("only_on_same_position");
  private Boolean _onlyOnSamePosition;
  public Boolean getOnlyOnSamePosition() { return this._onlyOnSamePosition; }
  public UniqueTokenFilter setOnlyOnSamePosition(Boolean val) { this._onlyOnSamePosition = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UniqueTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UniqueTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UniqueTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(UniqueTokenFilter.class.getName(), false, args -> new UniqueTokenFilter());

  static {
    PARSER.declareBoolean(UniqueTokenFilter::setOnlyOnSamePosition, ONLY_ON_SAME_POSITION);
  }

}
