
package org.elasticsearch.common_options.stats;

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

public class CompletionStats  implements XContentable<CompletionStats> {
  
  static final ParseField SIZE_IN_BYTES = new ParseField("size_in_bytes");
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public CompletionStats setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CompletionStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CompletionStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CompletionStats, Void> PARSER =
    new ConstructingObjectParser<>(CompletionStats.class.getName(), false, args -> new CompletionStats());

  static {
    PARSER.declareLong(CompletionStats::setSizeInBytes, SIZE_IN_BYTES);
  }

}
