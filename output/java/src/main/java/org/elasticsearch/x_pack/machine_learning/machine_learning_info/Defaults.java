
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.machine_learning.machine_learning_info.*;

public class Defaults  implements XContentable<Defaults> {
  
  static final ParseField ANOMALY_DETECTORS = new ParseField("anomaly_detectors");
  private AnomalyDetectors _anomalyDetectors;
  public AnomalyDetectors getAnomalyDetectors() { return this._anomalyDetectors; }
  public Defaults setAnomalyDetectors(AnomalyDetectors val) { this._anomalyDetectors = val; return this; }


  static final ParseField DATAFEEDS = new ParseField("datafeeds");
  private Datafeeds _datafeeds;
  public Datafeeds getDatafeeds() { return this._datafeeds; }
  public Defaults setDatafeeds(Datafeeds val) { this._datafeeds = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Defaults fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Defaults.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Defaults, Void> PARSER =
    new ConstructingObjectParser<>(Defaults.class.getName(), false, args -> new Defaults());

  static {
    PARSER.declareObject(Defaults::setAnomalyDetectors, (p, t) -> AnomalyDetectors.PARSER.apply(p, null), ANOMALY_DETECTORS);
    PARSER.declareObject(Defaults::setDatafeeds, (p, t) -> Datafeeds.PARSER.apply(p, null), DATAFEEDS);
  }

}
