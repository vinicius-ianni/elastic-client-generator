
package org.elasticsearch.x_pack.watcher.restart_watcher;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RestartWatcherResponse  implements XContentable<RestartWatcherResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RestartWatcherResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RestartWatcherResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RestartWatcherResponse, Void> PARSER =
    new ConstructingObjectParser<>(RestartWatcherResponse.class.getName(), false, args -> new RestartWatcherResponse());

  static {
    
  }

}
