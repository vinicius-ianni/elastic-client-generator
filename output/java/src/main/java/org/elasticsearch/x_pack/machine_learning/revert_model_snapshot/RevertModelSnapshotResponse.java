
package org.elasticsearch.x_pack.machine_learning.revert_model_snapshot;

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
import org.elasticsearch.x_pack.machine_learning.job.process.*;

public class RevertModelSnapshotResponse  implements XContentable<RevertModelSnapshotResponse> {
  
  static final ParseField MODEL = new ParseField("model");
  private ModelSnapshot _model;
  public ModelSnapshot getModel() { return this._model; }
  public RevertModelSnapshotResponse setModel(ModelSnapshot val) { this._model = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RevertModelSnapshotResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RevertModelSnapshotResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RevertModelSnapshotResponse, Void> PARSER =
    new ConstructingObjectParser<>(RevertModelSnapshotResponse.class.getName(), false, args -> new RevertModelSnapshotResponse());

  static {
    PARSER.declareObject(RevertModelSnapshotResponse::setModel, (p, t) -> ModelSnapshot.PARSER.apply(p, t), MODEL);
  }

}
