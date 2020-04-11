
package org.elasticsearch.analysis.tokenizers;

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
import org.elasticsearch.internal.*;

public class KeywordTokenizer  implements XContentable<KeywordTokenizer> {
  
  static final ParseField BUFFER_SIZE = new ParseField("buffer_size");
  private Integer _bufferSize;
  public Integer getBufferSize() { return this._bufferSize; }
  public KeywordTokenizer setBufferSize(Integer val) { this._bufferSize = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KeywordTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KeywordTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KeywordTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(KeywordTokenizer.class.getName(), false, args -> new KeywordTokenizer());

  static {
    PARSER.declareInt(KeywordTokenizer::setBufferSize, BUFFER_SIZE);
  }

}
