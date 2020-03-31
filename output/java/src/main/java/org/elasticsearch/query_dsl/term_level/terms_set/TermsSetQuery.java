
package org.elasticsearch.query_dsl.term_level.terms_set;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_options.scripting.*;

public class TermsSetQuery  {
  
  private Field _minimumShouldMatchField;
  public Field getMinimumShouldMatchField() { return this._minimumShouldMatchField; }
  public TermsSetQuery setMinimumShouldMatchField(Field val) { this._minimumShouldMatchField = val; return this; }


  private Script _minimumShouldMatchScript;
  public Script getMinimumShouldMatchScript() { return this._minimumShouldMatchScript; }
  public TermsSetQuery setMinimumShouldMatchScript(Script val) { this._minimumShouldMatchScript = val; return this; }


  private Object[] _terms;
  public Object[] getTerms() { return this._terms; }
  public TermsSetQuery setTerms(Object[] val) { this._terms = val; return this; }

}
