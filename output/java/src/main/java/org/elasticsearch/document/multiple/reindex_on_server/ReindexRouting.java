
package org.elasticsearch.document.multiple.reindex_on_server;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ReindexRouting  implements XContentable<ReindexRouting> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ReindexRouting fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexRouting.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReindexRouting, Void> PARSER =
    new ConstructingObjectParser<>(ReindexRouting.class.getName(), false, args -> new ReindexRouting());

  static {
    
  }

}
