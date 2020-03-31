
package org.elasticsearch.indices.analyze;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class CharFilterDetail  {
  
  private String[] _filteredText;
  public String[] getFilteredText() { return this._filteredText; }
  public CharFilterDetail setFilteredText(String[] val) { this._filteredText = val; return this; }


  private String _name;
  public String getName() { return this._name; }
  public CharFilterDetail setName(String val) { this._name = val; return this; }

}
