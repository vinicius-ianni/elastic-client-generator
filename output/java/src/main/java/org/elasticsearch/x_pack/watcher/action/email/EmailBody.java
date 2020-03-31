
package org.elasticsearch.x_pack.watcher.action.email;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class EmailBody  {
  
  private String _html;
  public String getHtml() { return this._html; }
  public EmailBody setHtml(String val) { this._html = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public EmailBody setText(String val) { this._text = val; return this; }

}
