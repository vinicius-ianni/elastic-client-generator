
package org.elasticsearch.aggregations.pipeline.moving_average.models;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class MovingAverageModel  implements XContentable<MovingAverageModel> {
  
  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public MovingAverageModel setName(String val) { this._name = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MovingAverageModel fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MovingAverageModel.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MovingAverageModel, Void> PARSER =
    new ConstructingObjectParser<>(MovingAverageModel.class.getName(), false, args -> new MovingAverageModel());

  static {
    PARSER.declareString(MovingAverageModel::setName, NAME);
  }

}
