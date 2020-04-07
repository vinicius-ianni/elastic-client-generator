
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class DataFeed  implements XContentable<DataFeed> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public DataFeed setCount(Long val) { this._count = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DataFeed fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DataFeed.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DataFeed, Void> PARSER =
    new ConstructingObjectParser<>(DataFeed.class.getName(), false, args -> new DataFeed());

  static {
    PARSER.declareLong(DataFeed::setCount, COUNT);
  }

}
