
package org.elasticsearch.query_dsl.term_level.terms;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.abstractions.field_lookup.*;

public class TermsQuery  implements XContentable<TermsQuery> {
  
  static final ParseField TERMS = new ParseField("terms");
  private List<Object> _terms;
  public List<Object> getTerms() { return this._terms; }
  public TermsQuery setTerms(List<Object> val) { this._terms = val; return this; }


  static final ParseField TERMS_LOOKUP = new ParseField("terms_lookup");
  private FieldLookup _termsLookup;
  public FieldLookup getTermsLookup() { return this._termsLookup; }
  public TermsQuery setTermsLookup(FieldLookup val) { this._termsLookup = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TermsQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TermsQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TermsQuery, Void> PARSER =
    new ConstructingObjectParser<>(TermsQuery.class.getName(), false, args -> new TermsQuery());

  static {
    PARSER.declareObjectArray(TermsQuery::setTerms, (p, t) -> Object.PARSER.apply(p), TERMS);
    PARSER.declareObject(TermsQuery::setTermsLookup, (p, t) -> FieldLookup.PARSER.apply(p, null), TERMS_LOOKUP);
  }

}
