
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class SmoothingModel  implements XContentable<SmoothingModel> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SmoothingModel fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SmoothingModel.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SmoothingModel, Void> PARSER =
    new ConstructingObjectParser<>(SmoothingModel.class.getName(), false, args -> new SmoothingModel());

  static {
    
  }

}
