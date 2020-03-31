
package org.elasticsearch.search.search_template.render_search_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class RenderSearchTemplateRequest  {
  
  private String _file;
  public String getFile() { return this._file; }
  public RenderSearchTemplateRequest setFile(String val) { this._file = val; return this; }


  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public RenderSearchTemplateRequest setParams(Map<String, Object> val) { this._params = val; return this; }


  private String _source;
  public String getSource() { return this._source; }
  public RenderSearchTemplateRequest setSource(String val) { this._source = val; return this; }

}
