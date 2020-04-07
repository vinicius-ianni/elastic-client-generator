
package org.elasticsearch.analysis.tokenizers;

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

public class StandardTokenizer  implements XContentable<StandardTokenizer> {
  
  static final ParseField MAX_TOKEN_LENGTH = new ParseField("max_token_length");
  private Integer _maxTokenLength;
  public Integer getMaxTokenLength() { return this._maxTokenLength; }
  public StandardTokenizer setMaxTokenLength(Integer val) { this._maxTokenLength = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StandardTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StandardTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StandardTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(StandardTokenizer.class.getName(), false, args -> new StandardTokenizer());

  static {
    PARSER.declareInteger(StandardTokenizer::setMaxTokenLength, MAX_TOKEN_LENGTH);
  }

}
