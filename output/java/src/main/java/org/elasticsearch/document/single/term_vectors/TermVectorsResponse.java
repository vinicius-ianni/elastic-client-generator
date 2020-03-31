
package org.elasticsearch.document.single.term_vectors;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.document.single.term_vectors.*;
import org.elasticsearch.internal.*;

public class TermVectorsResponse  {
  
  private Boolean _isValid;
  public Boolean getIsValid() { return this._isValid; }
  public TermVectorsResponse setIsValid(Boolean val) { this._isValid = val; return this; }


  private Boolean _found;
  public Boolean getFound() { return this._found; }
  public TermVectorsResponse setFound(Boolean val) { this._found = val; return this; }


  private String _id;
  public String getId() { return this._id; }
  public TermVectorsResponse setId(String val) { this._id = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public TermVectorsResponse setIndex(String val) { this._index = val; return this; }


  private Map<Field, TermVector> _termVectors;
  public Map<Field, TermVector> getTermVectors() { return this._termVectors; }
  public TermVectorsResponse setTermVectors(Map<Field, TermVector> val) { this._termVectors = val; return this; }


  private Long _took;
  public Long getTook() { return this._took; }
  public TermVectorsResponse setTook(Long val) { this._took = val; return this; }


  private String _type;
  public String getType() { return this._type; }
  public TermVectorsResponse setType(String val) { this._type = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public TermVectorsResponse setVersion(Long val) { this._version = val; return this; }

}
