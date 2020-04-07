
package org.elasticsearch.indices.index_settings.get_index_settings;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.index_modules.index_settings.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetIndexSettingsResponse extends DictionaryResponseBase<IndexName, IndexState> implements XContentable<GetIndexSettingsResponse> {
  
  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<IndexName, IndexState> _indices;
  public NamedContainer<IndexName, IndexState> getIndices() { return this._indices; }
  public GetIndexSettingsResponse setIndices(NamedContainer<IndexName, IndexState> val) { this._indices = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetIndexSettingsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetIndexSettingsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetIndexSettingsResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetIndexSettingsResponse.class.getName(), false, args -> new GetIndexSettingsResponse());

  static {
    PARSER.declareObject(GetIndexSettingsResponse::setIndices, (p, t) ->  new NamedContainer<>(n -> () -> new IndexName(n),pp -> IndexState.PARSER.apply(pp, null)), INDICES);;
  }

}
