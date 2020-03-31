
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.single.term_vectors.*;

public class TermVector  {
  
  private FieldStatistics _fieldStatistics;
  public FieldStatistics getFieldStatistics() { return this._fieldStatistics; }
  public TermVector setFieldStatistics(FieldStatistics val) { this._fieldStatistics = val; return this; }


  private Map<String, TermVectorTerm> _terms;
  public Map<String, TermVectorTerm> getTerms() { return this._terms; }
  public TermVector setTerms(Map<String, TermVectorTerm> val) { this._terms = val; return this; }

}
