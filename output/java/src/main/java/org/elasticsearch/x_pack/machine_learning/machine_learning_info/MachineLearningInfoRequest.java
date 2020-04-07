
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




public class MachineLearningInfoRequest  implements XContentable<MachineLearningInfoRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MachineLearningInfoRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MachineLearningInfoRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MachineLearningInfoRequest, Void> PARSER =
    new ConstructingObjectParser<>(MachineLearningInfoRequest.class.getName(), false, args -> new MachineLearningInfoRequest());

  static {
    
  }

}
