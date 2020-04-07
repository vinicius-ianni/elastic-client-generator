
package org.elasticsearch.aggregations.pipeline.moving_average;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.pipeline.moving_average.models.*;
import org.elasticsearch.internal.*;

public class MovingAverageAggregation  implements XContentable<MovingAverageAggregation> {
  
  static final ParseField MINIMIZE = new ParseField("minimize");
  private Boolean _minimize;
  public Boolean getMinimize() { return this._minimize; }
  public MovingAverageAggregation setMinimize(Boolean val) { this._minimize = val; return this; }


  static final ParseField MODEL = new ParseField("model");
  private MovingAverageModel _model;
  public MovingAverageModel getModel() { return this._model; }
  public MovingAverageAggregation setModel(MovingAverageModel val) { this._model = val; return this; }


  static final ParseField PREDICT = new ParseField("predict");
  private Integer _predict;
  public Integer getPredict() { return this._predict; }
  public MovingAverageAggregation setPredict(Integer val) { this._predict = val; return this; }


  static final ParseField WINDOW = new ParseField("window");
  private Integer _window;
  public Integer getWindow() { return this._window; }
  public MovingAverageAggregation setWindow(Integer val) { this._window = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MovingAverageAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MovingAverageAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MovingAverageAggregation, Void> PARSER =
    new ConstructingObjectParser<>(MovingAverageAggregation.class.getName(), false, args -> new MovingAverageAggregation());

  static {
    PARSER.declareBoolean(MovingAverageAggregation::setMinimize, MINIMIZE);
    PARSER.declareObject(MovingAverageAggregation::setModel, (p, t) -> MovingAverageModel.PARSER.apply(p, null), MODEL);
    PARSER.declareInteger(MovingAverageAggregation::setPredict, PREDICT);
    PARSER.declareInteger(MovingAverageAggregation::setWindow, WINDOW);
  }

}
