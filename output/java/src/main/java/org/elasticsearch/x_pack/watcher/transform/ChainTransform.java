
package org.elasticsearch.x_pack.watcher.transform;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.transform.*;

public class ChainTransform  implements XContentable<ChainTransform> {
  
  static final ParseField TRANSFORMS = new ParseField("transforms");
  private List<TransformContainer> _transforms;
  public List<TransformContainer> getTransforms() { return this._transforms; }
  public ChainTransform setTransforms(List<TransformContainer> val) { this._transforms = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ChainTransform fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ChainTransform.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ChainTransform, Void> PARSER =
    new ConstructingObjectParser<>(ChainTransform.class.getName(), false, args -> new ChainTransform());

  static {
    PARSER.declareObjectArray(ChainTransform::setTransforms, (p, t) -> TransformContainer.PARSER.apply(p), TRANSFORMS);
  }

}
