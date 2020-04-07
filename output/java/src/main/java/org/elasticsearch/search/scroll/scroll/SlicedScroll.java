
package org.elasticsearch.search.scroll.scroll;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;

public class SlicedScroll  implements XContentable<SlicedScroll> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public SlicedScroll setField(Field val) { this._field = val; return this; }


  static final ParseField ID = new ParseField("id");
  private Integer _id;
  public Integer getId() { return this._id; }
  public SlicedScroll setId(Integer val) { this._id = val; return this; }


  static final ParseField MAX = new ParseField("max");
  private Integer _max;
  public Integer getMax() { return this._max; }
  public SlicedScroll setMax(Integer val) { this._max = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SlicedScroll fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SlicedScroll.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SlicedScroll, Void> PARSER =
    new ConstructingObjectParser<>(SlicedScroll.class.getName(), false, args -> new SlicedScroll());

  static {
    PARSER.declareField(SlicedScroll::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareInteger(SlicedScroll::setId, ID);
    PARSER.declareInteger(SlicedScroll::setMax, MAX);
  }

}
