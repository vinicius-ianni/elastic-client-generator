
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

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

public class StupidBackoffSmoothingModel  implements XContentable<StupidBackoffSmoothingModel> {
  
  static final ParseField DISCOUNT = new ParseField("discount");
  private Double _discount;
  public Double getDiscount() { return this._discount; }
  public StupidBackoffSmoothingModel setDiscount(Double val) { this._discount = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(DISCOUNT.getPreferredName(), _discount);
    builder.endObject();
    return builder;
  }

  @Override
  public StupidBackoffSmoothingModel fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StupidBackoffSmoothingModel.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StupidBackoffSmoothingModel, Void> PARSER =
    new ConstructingObjectParser<>(StupidBackoffSmoothingModel.class.getName(), false, args -> new StupidBackoffSmoothingModel());

  static {
    PARSER.declareDouble(StupidBackoffSmoothingModel::setDiscount, DISCOUNT);
  }

}
