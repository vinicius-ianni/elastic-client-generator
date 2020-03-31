
package org.elasticsearch.cat.cat_aliases;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatAliasesRecord  {
  
  private String _alias;
  public String getAlias() { return this._alias; }
  public CatAliasesRecord setAlias(String val) { this._alias = val; return this; }


  private String _filter;
  public String getFilter() { return this._filter; }
  public CatAliasesRecord setFilter(String val) { this._filter = val; return this; }


  private String _index;
  public String getIndex() { return this._index; }
  public CatAliasesRecord setIndex(String val) { this._index = val; return this; }


  private String _indexRouting;
  public String getIndexRouting() { return this._indexRouting; }
  public CatAliasesRecord setIndexRouting(String val) { this._indexRouting = val; return this; }


  private String _searchRouting;
  public String getSearchRouting() { return this._searchRouting; }
  public CatAliasesRecord setSearchRouting(String val) { this._searchRouting = val; return this; }

}
