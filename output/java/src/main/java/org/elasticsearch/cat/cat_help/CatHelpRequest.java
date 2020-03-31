
package org.elasticsearch.cat.cat_help;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CatHelpRequest  {
  
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatHelpRequest setHelp(Boolean val) { this._help = val; return this; }


  private String[] _sortByColumns;
  public String[] getSortByColumns() { return this._sortByColumns; }
  public CatHelpRequest setSortByColumns(String[] val) { this._sortByColumns = val; return this; }

}
