
package org.elasticsearch.aggregations.bucket.terms;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.aggregations.bucket.terms.*;
import org.elasticsearch.search.search.sort.*;

public class TermsOrder  implements XContentable<TermsOrder> {
  
  static final ParseField COUNT_ASCENDING = new ParseField("count_ascending");
  private TermsOrder _countAscending;
  public TermsOrder getCountAscending() { return this._countAscending; }
  public TermsOrder setCountAscending(TermsOrder val) { this._countAscending = val; return this; }


  static final ParseField COUNT_DESCENDING = new ParseField("count_descending");
  private TermsOrder _countDescending;
  public TermsOrder getCountDescending() { return this._countDescending; }
  public TermsOrder setCountDescending(TermsOrder val) { this._countDescending = val; return this; }


  static final ParseField KEY = new ParseField("key");
  private String _key;
  public String getKey() { return this._key; }
  public TermsOrder setKey(String val) { this._key = val; return this; }


  static final ParseField KEY_ASCENDING = new ParseField("key_ascending");
  private TermsOrder _keyAscending;
  public TermsOrder getKeyAscending() { return this._keyAscending; }
  public TermsOrder setKeyAscending(TermsOrder val) { this._keyAscending = val; return this; }


  static final ParseField KEY_DESCENDING = new ParseField("key_descending");
  private TermsOrder _keyDescending;
  public TermsOrder getKeyDescending() { return this._keyDescending; }
  public TermsOrder setKeyDescending(TermsOrder val) { this._keyDescending = val; return this; }


  static final ParseField ORDER = new ParseField("order");
  private SortOrder _order;
  public SortOrder getOrder() { return this._order; }
  public TermsOrder setOrder(SortOrder val) { this._order = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermsOrder fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermsOrder.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermsOrder, Void> PARSER =
    new ConstructingObjectParser<>(TermsOrder.class.getName(), false, args -> new TermsOrder());

  static {
    PARSER.declareObject(TermsOrder::setCountAscending, (p, t) -> TermsOrder.PARSER.apply(p, null), COUNT_ASCENDING);
    PARSER.declareObject(TermsOrder::setCountDescending, (p, t) -> TermsOrder.PARSER.apply(p, null), COUNT_DESCENDING);
    PARSER.declareString(TermsOrder::setKey, KEY);
    PARSER.declareObject(TermsOrder::setKeyAscending, (p, t) -> TermsOrder.PARSER.apply(p, null), KEY_ASCENDING);
    PARSER.declareObject(TermsOrder::setKeyDescending, (p, t) -> TermsOrder.PARSER.apply(p, null), KEY_DESCENDING);
    PARSER.declareObject(TermsOrder::setOrder, (p, t) -> SortOrder.PARSER.apply(p, null), ORDER);
  }

}
