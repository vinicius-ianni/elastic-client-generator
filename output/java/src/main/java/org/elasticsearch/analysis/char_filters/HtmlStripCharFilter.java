
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




public class HtmlStripCharFilter  implements XContentable<HtmlStripCharFilter> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HtmlStripCharFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HtmlStripCharFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HtmlStripCharFilter, Void> PARSER =
    new ConstructingObjectParser<>(HtmlStripCharFilter.class.getName(), false, args -> new HtmlStripCharFilter());

  static {
    
  }

}
