
package org.elasticsearch.search.explain;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.explain.*;

public class ExplainResponse<TDocument>  implements XContentable<ExplainResponse> {
  
  static final ParseField EXPLANATION = new ParseField("explanation");
  private ExplanationDetail _explanation;
  public ExplanationDetail getExplanation() { return this._explanation; }
  public ExplainResponse<TDocument> setExplanation(ExplanationDetail val) { this._explanation = val; return this; }


  static final ParseField GET = new ParseField("get");
  private InlineGet<TDocument> _get;
  public InlineGet<TDocument> getGet() { return this._get; }
  public ExplainResponse<TDocument> setGet(InlineGet<TDocument> val) { this._get = val; return this; }


  static final ParseField MATCHED = new ParseField("matched");
  private Boolean _matched;
  public Boolean getMatched() { return this._matched; }
  public ExplainResponse<TDocument> setMatched(Boolean val) { this._matched = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExplainResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExplainResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExplainResponse, Void> PARSER =
    new ConstructingObjectParser<>(ExplainResponse.class.getName(), false, args -> new ExplainResponse());

  static {
    PARSER.declareObject(ExplainResponse::setExplanation, (p, t) -> ExplanationDetail.PARSER.apply(p, null), EXPLANATION);
    PARSER.declareObject(ExplainResponse::setGet, (p, t) -> InlineGet<TDocument>.PARSER.apply(p, null), GET);
    PARSER.declareBoolean(ExplainResponse::setMatched, MATCHED);
  }

}
