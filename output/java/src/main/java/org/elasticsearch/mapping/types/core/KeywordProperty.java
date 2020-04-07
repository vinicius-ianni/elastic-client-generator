
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
import org.elasticsearch.mapping.types.core.*;

public class KeywordProperty  implements XContentable<KeywordProperty> {
  
  static final ParseField BOOST = new ParseField("boost");
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public KeywordProperty setBoost(Double val) { this._boost = val; return this; }


  static final ParseField EAGER_GLOBAL_ORDINALS = new ParseField("eager_global_ordinals");
  private Boolean _eagerGlobalOrdinals;
  public Boolean getEagerGlobalOrdinals() { return this._eagerGlobalOrdinals; }
  public KeywordProperty setEagerGlobalOrdinals(Boolean val) { this._eagerGlobalOrdinals = val; return this; }


  static final ParseField IGNORE_ABOVE = new ParseField("ignore_above");
  private Integer _ignoreAbove;
  public Integer getIgnoreAbove() { return this._ignoreAbove; }
  public KeywordProperty setIgnoreAbove(Integer val) { this._ignoreAbove = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public KeywordProperty setIndex(Boolean val) { this._index = val; return this; }


  static final ParseField INDEX_OPTIONS = new ParseField("index_options");
  private IndexOptions _indexOptions;
  public IndexOptions getIndexOptions() { return this._indexOptions; }
  public KeywordProperty setIndexOptions(IndexOptions val) { this._indexOptions = val; return this; }


  static final ParseField NORMALIZER = new ParseField("normalizer");
  private String _normalizer;
  public String getNormalizer() { return this._normalizer; }
  public KeywordProperty setNormalizer(String val) { this._normalizer = val; return this; }


  static final ParseField NORMS = new ParseField("norms");
  private Boolean _norms;
  public Boolean getNorms() { return this._norms; }
  public KeywordProperty setNorms(Boolean val) { this._norms = val; return this; }


  static final ParseField NULL_VALUE = new ParseField("null_value");
  private String _nullValue;
  public String getNullValue() { return this._nullValue; }
  public KeywordProperty setNullValue(String val) { this._nullValue = val; return this; }


  static final ParseField SPLIT_QUERIES_ON_WHITESPACE = new ParseField("split_queries_on_whitespace");
  private Boolean _splitQueriesOnWhitespace;
  public Boolean getSplitQueriesOnWhitespace() { return this._splitQueriesOnWhitespace; }
  public KeywordProperty setSplitQueriesOnWhitespace(Boolean val) { this._splitQueriesOnWhitespace = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KeywordProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KeywordProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KeywordProperty, Void> PARSER =
    new ConstructingObjectParser<>(KeywordProperty.class.getName(), false, args -> new KeywordProperty());

  static {
    PARSER.declareDouble(KeywordProperty::setBoost, BOOST);
    PARSER.declareBoolean(KeywordProperty::setEagerGlobalOrdinals, EAGER_GLOBAL_ORDINALS);
    PARSER.declareInteger(KeywordProperty::setIgnoreAbove, IGNORE_ABOVE);
    PARSER.declareBoolean(KeywordProperty::setIndex, INDEX);
    PARSER.declareObject(KeywordProperty::setIndexOptions, (p, t) -> IndexOptions.PARSER.apply(p, null), INDEX_OPTIONS);
    PARSER.declareString(KeywordProperty::setNormalizer, NORMALIZER);
    PARSER.declareBoolean(KeywordProperty::setNorms, NORMS);
    PARSER.declareString(KeywordProperty::setNullValue, NULL_VALUE);
    PARSER.declareBoolean(KeywordProperty::setSplitQueriesOnWhitespace, SPLIT_QUERIES_ON_WHITESPACE);
  }

}
