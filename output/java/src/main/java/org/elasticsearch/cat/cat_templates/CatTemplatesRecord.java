
package org.elasticsearch.cat.cat_templates;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.internal.*;

public class CatTemplatesRecord  {
  
  private String _indexPatterns;
  public String getIndexPatterns() { return this._indexPatterns; }
  public CatTemplatesRecord setIndexPatterns(String val) { this._indexPatterns = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CatTemplatesRecord setName(String val) { this._name = val; return this; }


  private Long _order;
  public Long getOrder() { return this._order; }
  public CatTemplatesRecord setOrder(Long val) { this._order = val; return this; }


  private Long _version;
  public Long getVersion() { return this._version; }
  public CatTemplatesRecord setVersion(Long val) { this._version = val; return this; }

}
