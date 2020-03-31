
package org.elasticsearch.search.search_template.render_search_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.common_abstractions.lazy_document.*;

public class RenderSearchTemplateResponse  {
  
  private LazyDocument _templateOutput;
  public LazyDocument getTemplateOutput() { return this._templateOutput; }
  public RenderSearchTemplateResponse setTemplateOutput(LazyDocument val) { this._templateOutput = val; return this; }

}
