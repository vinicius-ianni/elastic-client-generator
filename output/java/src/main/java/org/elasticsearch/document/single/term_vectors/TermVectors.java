
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.document.single.term_vectors.*;
import org.elasticsearch.internal.*;

public class TermVectors  {
  
  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public TermVectors setFound(Boolean val) { this._found = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public TermVectors setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public TermVectors setIndex(String val) { this._index = val; return this; }


  private Map<Field, TermVector> _termVectors;
  public Map<Field, TermVector> getTermVectors() { return this._termVectors; }
  public TermVectors setTermVectors(Map<Field, TermVector> val) { this._termVectors = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public TermVectors setTook(Long val) { this._took = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public TermVectors setVersion(Long val) { this._version = val; return this; }

}
