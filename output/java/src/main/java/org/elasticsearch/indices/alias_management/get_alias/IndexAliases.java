
package org.elasticsearch.indices.alias_management.get_alias;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.indices.alias_management.*;

public class IndexAliases  {
  
  private Map<String, AliasDefinition> _aliases;
  public Map<String, AliasDefinition> getAliases() { return this._aliases; }
  public IndexAliases setAliases(Map<String, AliasDefinition> val) { this._aliases = val; return this; }

}
