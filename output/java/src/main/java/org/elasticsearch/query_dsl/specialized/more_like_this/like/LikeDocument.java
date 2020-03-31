
package org.elasticsearch.query_dsl.specialized.more_like_this.like;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class LikeDocument  {
  
  private Object _doc;
  public Object getDoc() { return this._doc; }
  public LikeDocument setDoc(Object val) { this._doc = val; return this; }


  private Field[] _fields;
  public Field[] getFields() { return this._fields; }
  public LikeDocument setFields(Field[] val) { this._fields = val; return this; }


  private Id _id;
  public Id getId() { return this._id; }
  public LikeDocument setId(Id val) { this._id = val; return this; }


  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public LikeDocument setIndex(IndexName val) { this._index = val; return this; }


  private Map<Field, String> _perFieldAnalyzer;
  public Map<Field, String> getPerFieldAnalyzer() { return this._perFieldAnalyzer; }
  public LikeDocument setPerFieldAnalyzer(Map<Field, String> val) { this._perFieldAnalyzer = val; return this; }


  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public LikeDocument setRouting(Routing val) { this._routing = val; return this; }

}
