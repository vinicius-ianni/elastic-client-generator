
package org.elasticsearch.modules.scripting.execute_painless_script;

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
import org.elasticsearch.query_dsl.abstractions.container.*;

public class PainlessContextSetup  implements XContentable<PainlessContextSetup> {
  
  static final ParseField DOCUMENT = new ParseField("document");
  private Object _document;
  public Object getDocument() { return this._document; }
  public PainlessContextSetup setDocument(Object val) { this._document = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public PainlessContextSetup setIndex(IndexName val) { this._index = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public PainlessContextSetup setQuery(QueryContainer val) { this._query = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PainlessContextSetup fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PainlessContextSetup.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PainlessContextSetup, Void> PARSER =
    new ConstructingObjectParser<>(PainlessContextSetup.class.getName(), false, args -> new PainlessContextSetup());

  static {
    PARSER.declareObject(PainlessContextSetup::setDocument, (p, t) -> Object.PARSER.apply(p, null), DOCUMENT);
    PARSER.declareIndexName(PainlessContextSetup::setIndex, (p, t) -> IndexName.createFrom(p), INDEX);
    PARSER.declareObject(PainlessContextSetup::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, null), QUERY);
  }

}
