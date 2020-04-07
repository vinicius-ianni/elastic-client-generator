
package org.elasticsearch.indices.index_settings.index_templates.delete_index_template;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.time_unit.*;

public class DeleteIndexTemplateRequest  implements XContentable<DeleteIndexTemplateRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public DeleteIndexTemplateRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public DeleteIndexTemplateRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteIndexTemplateRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteIndexTemplateRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteIndexTemplateRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteIndexTemplateRequest.class.getName(), false, args -> new DeleteIndexTemplateRequest());

  static {
    PARSER.declareObject(DeleteIndexTemplateRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(DeleteIndexTemplateRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
