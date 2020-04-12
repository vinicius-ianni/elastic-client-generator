
package org.elasticsearch.common_abstractions.response;

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
import org.elasticsearch.common_options.hit.*;

public class ShardsOperationResponseBase  implements XContentable<ShardsOperationResponseBase> {
  
  static final ParseField SHARDS = new ParseField("_shards");
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public ShardsOperationResponseBase setShards(ShardStatistics val) { this._shards = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    if (_shards != null) {
      builder.field(SHARDS.getPreferredName());
      _shards.toXContent(builder, params);
    }
    return builder;
  }

  @Override
  public ShardsOperationResponseBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardsOperationResponseBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardsOperationResponseBase, Void> PARSER =
    new ConstructingObjectParser<>(ShardsOperationResponseBase.class.getName(), false, args -> new ShardsOperationResponseBase());

  static {
    PARSER.declareObject(ShardsOperationResponseBase::setShards, (p, t) -> ShardStatistics.PARSER.apply(p, t), SHARDS);
  }

}
