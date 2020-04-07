
package org.elasticsearch.search.suggesters;

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
import org.elasticsearch.search.suggesters.*;

public class Suggest implements XContentable<Suggest> {

  static final ParseField LENGTH = new ParseField("length");
  private Integer _length;
  public Integer getLength() { return this._length; }
  public Suggest> setLength(Integer val) { this._length = val; return this; }


  static final ParseField OFFSET = new ParseField("offset");
  private Integer _offset;
  public Integer getOffset() { return this._offset; }
  public Suggest<T> setOffset(Integer val) { this._offset = val; return this; }


  static final ParseField OPTIONS = new ParseField("options");
  private List<SuggestOption<T>> _options;
  public List<SuggestOption<T>> getOptions() { return this._options; }
  public Suggest<T> setOptions(List<SuggestOption<T>> val) { this._options = val; return this; }


  static final ParseField TEXT = new ParseField("text");
  private String _text;
  public String getText() { return this._text; }
  public Suggest<T> setText(String val) { this._text = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Suggest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Suggest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Suggest, Void> PARSER =
    new ConstructingObjectParser<>(Suggest.class.getName(), false, args -> new Suggest());

  static {
    PARSER.declareInteger(Suggest::setLength, LENGTH);
    PARSER.declareInteger(Suggest::setOffset, OFFSET);
    PARSER.declareObjectArray(Suggest::setOptions, (p, t) -> SuggestOption<T>.PARSER.apply(p), OPTIONS);
    PARSER.declareString(Suggest::setText, TEXT);
  }

}
