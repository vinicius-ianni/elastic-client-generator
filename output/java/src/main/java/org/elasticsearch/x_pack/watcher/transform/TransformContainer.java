
package org.elasticsearch.x_pack.watcher.transform;

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
import org.elasticsearch.x_pack.watcher.transform.*;

public class TransformContainer  implements XContentable<TransformContainer> {
  
  static final ParseField CHAIN = new ParseField("chain");
  private ChainTransform _chain;
  public ChainTransform getChain() { return this._chain; }
  public TransformContainer setChain(ChainTransform val) { this._chain = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private ScriptTransform _script;
  public ScriptTransform getScript() { return this._script; }
  public TransformContainer setScript(ScriptTransform val) { this._script = val; return this; }


  static final ParseField SEARCH = new ParseField("search");
  private SearchTransform _search;
  public SearchTransform getSearch() { return this._search; }
  public TransformContainer setSearch(SearchTransform val) { this._search = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TransformContainer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TransformContainer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TransformContainer, Void> PARSER =
    new ConstructingObjectParser<>(TransformContainer.class.getName(), false, args -> new TransformContainer());

  static {
    PARSER.declareObject(TransformContainer::setChain, (p, t) -> ChainTransform.PARSER.apply(p, t), CHAIN);
    PARSER.declareObject(TransformContainer::setScript, (p, t) -> ScriptTransform.PARSER.apply(p, t), SCRIPT);
    PARSER.declareObject(TransformContainer::setSearch, (p, t) -> SearchTransform.PARSER.apply(p, t), SEARCH);
  }

}
