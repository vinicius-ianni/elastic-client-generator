
package org.elasticsearch.x_pack.machine_learning.get_influencers;

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
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class GetInfluencersRequest  implements XContentable<GetInfluencersRequest> {
  
  static final ParseField DESCENDING = new ParseField("descending");
  private Boolean _descending;
  public Boolean getDescending() { return this._descending; }
  public GetInfluencersRequest setDescending(Boolean val) { this._descending = val; return this; }


  static final ParseField END = new ParseField("end");
  private Date _end;
  public Date getEnd() { return this._end; }
  public GetInfluencersRequest setEnd(Date val) { this._end = val; return this; }


  static final ParseField EXCLUDE_INTERIM = new ParseField("exclude_interim");
  private Boolean _excludeInterim;
  public Boolean getExcludeInterim() { return this._excludeInterim; }
  public GetInfluencersRequest setExcludeInterim(Boolean val) { this._excludeInterim = val; return this; }


  static final ParseField INFLUENCER_SCORE = new ParseField("influencer_score");
  private Double _influencerScore;
  public Double getInfluencerScore() { return this._influencerScore; }
  public GetInfluencersRequest setInfluencerScore(Double val) { this._influencerScore = val; return this; }


  static final ParseField PAGE = new ParseField("page");
  private Page _page;
  public Page getPage() { return this._page; }
  public GetInfluencersRequest setPage(Page val) { this._page = val; return this; }


  static final ParseField SORT = new ParseField("sort");
  private Field _sort;
  public Field getSort() { return this._sort; }
  public GetInfluencersRequest setSort(Field val) { this._sort = val; return this; }


  static final ParseField START = new ParseField("start");
  private Date _start;
  public Date getStart() { return this._start; }
  public GetInfluencersRequest setStart(Date val) { this._start = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetInfluencersRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetInfluencersRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetInfluencersRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetInfluencersRequest.class.getName(), false, args -> new GetInfluencersRequest());

  static {
    PARSER.declareBoolean(GetInfluencersRequest::setDescending, DESCENDING);
    PARSER.declareObject(GetInfluencersRequest::setEnd, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), END);
    PARSER.declareBoolean(GetInfluencersRequest::setExcludeInterim, EXCLUDE_INTERIM);
    PARSER.declareDouble(GetInfluencersRequest::setInfluencerScore, INFLUENCER_SCORE);
    PARSER.declareObject(GetInfluencersRequest::setPage, (p, t) -> Page.PARSER.apply(p, t), PAGE);
    PARSER.declareObject(GetInfluencersRequest::setSort, (p, t) -> Field.createFrom(p), SORT);
    PARSER.declareObject(GetInfluencersRequest::setStart, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), START);
  }

}
