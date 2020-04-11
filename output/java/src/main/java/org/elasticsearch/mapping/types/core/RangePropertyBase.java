
package org.elasticsearch.mapping.types.core;

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

public class RangePropertyBase  implements XContentable<RangePropertyBase> {
  
  static final ParseField BOOST = new ParseField("boost");
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public RangePropertyBase setBoost(Double val) { this._boost = val; return this; }


  static final ParseField COERCE = new ParseField("coerce");
  private Boolean _coerce;
  public Boolean getCoerce() { return this._coerce; }
  public RangePropertyBase setCoerce(Boolean val) { this._coerce = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public RangePropertyBase setIndex(Boolean val) { this._index = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RangePropertyBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RangePropertyBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RangePropertyBase, Void> PARSER =
    new ConstructingObjectParser<>(RangePropertyBase.class.getName(), false, args -> new RangePropertyBase());

  static {
    PARSER.declareDouble(RangePropertyBase::setBoost, BOOST);
    PARSER.declareBoolean(RangePropertyBase::setCoerce, COERCE);
    PARSER.declareBoolean(RangePropertyBase::setIndex, INDEX);
  }

}
