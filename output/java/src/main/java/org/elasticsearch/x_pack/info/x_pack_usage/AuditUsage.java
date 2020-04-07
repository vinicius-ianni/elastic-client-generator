
package org.elasticsearch.x_pack.info.x_pack_usage;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class AuditUsage  implements XContentable<AuditUsage> {
  
  static final ParseField OUTPUTS = new ParseField("outputs");
  private List<String> _outputs;
  public List<String> getOutputs() { return this._outputs; }
  public AuditUsage setOutputs(List<String> val) { this._outputs = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AuditUsage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AuditUsage.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AuditUsage, Void> PARSER =
    new ConstructingObjectParser<>(AuditUsage.class.getName(), false, args -> new AuditUsage());

  static {
    PARSER.declareStringArray(AuditUsage::setOutputs, OUTPUTS);
  }

}
