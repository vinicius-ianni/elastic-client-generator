
package org.elasticsearch.x_pack.machine_learning.job.config;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ModelPlotConfigEnabled  implements XContentable<ModelPlotConfigEnabled> {
  
  static final ParseField ENABLED = new ParseField("enabled");
  private Boolean _enabled;
  public Boolean getEnabled() { return this._enabled; }
  public ModelPlotConfigEnabled setEnabled(Boolean val) { this._enabled = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ModelPlotConfigEnabled fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ModelPlotConfigEnabled.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ModelPlotConfigEnabled, Void> PARSER =
    new ConstructingObjectParser<>(ModelPlotConfigEnabled.class.getName(), false, args -> new ModelPlotConfigEnabled());

  static {
    PARSER.declareBoolean(ModelPlotConfigEnabled::setEnabled, ENABLED);
  }

}
