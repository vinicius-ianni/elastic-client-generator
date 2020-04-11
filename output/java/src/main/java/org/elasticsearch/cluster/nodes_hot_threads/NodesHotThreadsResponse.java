
package org.elasticsearch.cluster.nodes_hot_threads;

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
import org.elasticsearch.cluster.nodes_hot_threads.*;

public class NodesHotThreadsResponse  implements XContentable<NodesHotThreadsResponse> {
  
  static final ParseField HOT_THREADS = new ParseField("hot_threads");
  private List<HotThreadInformation> _hotThreads;
  public List<HotThreadInformation> getHotThreads() { return this._hotThreads; }
  public NodesHotThreadsResponse setHotThreads(List<HotThreadInformation> val) { this._hotThreads = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodesHotThreadsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesHotThreadsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodesHotThreadsResponse, Void> PARSER =
    new ConstructingObjectParser<>(NodesHotThreadsResponse.class.getName(), false, args -> new NodesHotThreadsResponse());

  static {
    PARSER.declareObjectArray(NodesHotThreadsResponse::setHotThreads, (p, t) -> HotThreadInformation.PARSER.apply(p, t), HOT_THREADS);
  }

}
