
package org.elasticsearch.mapping.dynamic_template;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.mapping.types.*;
import org.elasticsearch.mapping.dynamic_template.*;

public class DynamicTemplate  {
  
  private IProperty _mapping;
  public IProperty getMapping() { return this._mapping; }
  public DynamicTemplate setMapping(IProperty val) { this._mapping = val; return this; }


  private String _match;
  public String getMatch() { return this._match; }
  public DynamicTemplate setMatch(String val) { this._match = val; return this; }


  private String _matchMappingType;
  public String getMatchMappingType() { return this._matchMappingType; }
  public DynamicTemplate setMatchMappingType(String val) { this._matchMappingType = val; return this; }


  private MatchType _matchPattern;
  public MatchType getMatchPattern() { return this._matchPattern; }
  public DynamicTemplate setMatchPattern(MatchType val) { this._matchPattern = val; return this; }


  private String _pathMatch;
  public String getPathMatch() { return this._pathMatch; }
  public DynamicTemplate setPathMatch(String val) { this._pathMatch = val; return this; }


  private String _pathUnmatch;
  public String getPathUnmatch() { return this._pathUnmatch; }
  public DynamicTemplate setPathUnmatch(String val) { this._pathUnmatch = val; return this; }


  private String _unmatch;
  public String getUnmatch() { return this._unmatch; }
  public DynamicTemplate setUnmatch(String val) { this._unmatch = val; return this; }

}
