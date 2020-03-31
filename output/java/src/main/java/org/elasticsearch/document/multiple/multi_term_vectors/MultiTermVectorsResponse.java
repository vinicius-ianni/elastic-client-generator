
package org.elasticsearch.document.multiple.multi_term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.document.single.term_vectors.*;

public class MultiTermVectorsResponse  {
  
  private TermVectors[] _docs;
  public TermVectors[] getDocs() { return this._docs; }
  public MultiTermVectorsResponse setDocs(TermVectors[] val) { this._docs = val; return this; }

}
