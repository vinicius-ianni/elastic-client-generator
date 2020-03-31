
package org.elasticsearch.query_dsl.specialized.percolate;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.internal.*;

public class PercolateQuery  {
  
  private Object _document;
  public Object getDocument() { return this._document; }
  public PercolateQuery setDocument(Object val) { this._document = val; return this; }


  private Object[] _documents;
  public Object[] getDocuments() { return this._documents; }
  public PercolateQuery setDocuments(Object[] val) { this._documents = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public PercolateQuery setField(Field val) { this._field = val; return this; }


  private Id _id;
  public Id getId() { return this._id; }
  public PercolateQuery setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public PercolateQuery setIndex(IndexName val) { this._index = val; return this; }


  private String _preference;
  public String getPreference() { return this._preference; }
  public PercolateQuery setPreference(String val) { this._preference = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public PercolateQuery setRouting(Routing val) { this._routing = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public PercolateQuery setVersion(Long val) { this._version = val; return this; }

}
