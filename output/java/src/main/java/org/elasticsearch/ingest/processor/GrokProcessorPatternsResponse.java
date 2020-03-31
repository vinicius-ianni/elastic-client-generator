
package org.elasticsearch.ingest.processor;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class GrokProcessorPatternsResponse  {
  
  private Map<String, String> _patterns;
  public Map<String, String> getPatterns() { return this._patterns; }
  public GrokProcessorPatternsResponse setPatterns(Map<String, String> val) { this._patterns = val; return this; }

}
