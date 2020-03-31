
package org.elasticsearch.query_dsl.term_level.terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.query_dsl.abstractions.field_lookup.*;

public class TermsQuery  {
  
  private Object[] _terms;
  public Object[] getTerms() { return this._terms; }
  public TermsQuery setTerms(Object[] val) { this._terms = val; return this; }


  private FieldLookup _termsLookup;
  public FieldLookup getTermsLookup() { return this._termsLookup; }
  public TermsQuery setTermsLookup(FieldLookup val) { this._termsLookup = val; return this; }

}
