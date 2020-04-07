
package org.elasticsearch.common;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class Dictionary<TKey, TValue>  implements XContentable<Dictionary> {
  
  static final ParseField KEY = new ParseField("key");
  private TKey _key;
  public TKey getKey() { return this._key; }
  public Dictionary<TKey, TValue> setKey(TKey val) { this._key = val; return this; }


  static final ParseField VALUE = new ParseField("value");
  private TValue _value;
  public TValue getValue() { return this._value; }
  public Dictionary<TKey, TValue> setValue(TValue val) { this._value = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Dictionary fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Dictionary.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Dictionary, Void> PARSER =
    new ConstructingObjectParser<>(Dictionary.class.getName(), false, args -> new Dictionary());

  static {
    PARSER.declareObject(Dictionary::setKey, (p, t) -> TKey.PARSER.apply(p, null), KEY);
    PARSER.declareObject(Dictionary::setValue, (p, t) -> TValue.PARSER.apply(p, null), VALUE);
  }

}
