
package org.elasticsearch.mapping.types.core;

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

public class TextIndexPrefixes  implements XContentable<TextIndexPrefixes> {
  
  static final ParseField MAX_CHARS = new ParseField("max_chars");
  private Integer _maxChars;
  public Integer getMaxChars() { return this._maxChars; }
  public TextIndexPrefixes setMaxChars(Integer val) { this._maxChars = val; return this; }


  static final ParseField MIN_CHARS = new ParseField("min_chars");
  private Integer _minChars;
  public Integer getMinChars() { return this._minChars; }
  public TextIndexPrefixes setMinChars(Integer val) { this._minChars = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TextIndexPrefixes fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TextIndexPrefixes.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TextIndexPrefixes, Void> PARSER =
    new ConstructingObjectParser<>(TextIndexPrefixes.class.getName(), false, args -> new TextIndexPrefixes());

  static {
    PARSER.declareInteger(TextIndexPrefixes::setMaxChars, MAX_CHARS);
    PARSER.declareInteger(TextIndexPrefixes::setMinChars, MIN_CHARS);
  }

}
