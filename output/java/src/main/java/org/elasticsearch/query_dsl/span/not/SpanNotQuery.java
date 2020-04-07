
package org.elasticsearch.query_dsl.span.not;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.span.*;

public class SpanNotQuery  implements XContentable<SpanNotQuery> {
  
  static final ParseField DIST = new ParseField("dist");
  private Integer _dist;
  public Integer getDist() { return this._dist; }
  public SpanNotQuery setDist(Integer val) { this._dist = val; return this; }


  static final ParseField EXCLUDE = new ParseField("exclude");
  private SpanQuery _exclude;
  public SpanQuery getExclude() { return this._exclude; }
  public SpanNotQuery setExclude(SpanQuery val) { this._exclude = val; return this; }


  static final ParseField INCLUDE = new ParseField("include");
  private SpanQuery _include;
  public SpanQuery getInclude() { return this._include; }
  public SpanNotQuery setInclude(SpanQuery val) { this._include = val; return this; }


  static final ParseField POST = new ParseField("post");
  private Integer _post;
  public Integer getPost() { return this._post; }
  public SpanNotQuery setPost(Integer val) { this._post = val; return this; }


  static final ParseField PRE = new ParseField("pre");
  private Integer _pre;
  public Integer getPre() { return this._pre; }
  public SpanNotQuery setPre(Integer val) { this._pre = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanNotQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanNotQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanNotQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanNotQuery.class.getName(), false, args -> new SpanNotQuery());

  static {
    PARSER.declareInteger(SpanNotQuery::setDist, DIST);
    PARSER.declareObject(SpanNotQuery::setExclude, (p, t) -> SpanQuery.PARSER.apply(p, null), EXCLUDE);
    PARSER.declareObject(SpanNotQuery::setInclude, (p, t) -> SpanQuery.PARSER.apply(p, null), INCLUDE);
    PARSER.declareInteger(SpanNotQuery::setPost, POST);
    PARSER.declareInteger(SpanNotQuery::setPre, PRE);
  }

}
