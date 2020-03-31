
package org.elasticsearch.x_pack.watcher.action.slack;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class SlackAttachmentField  {
  
  private Boolean _short;
  public Boolean getShort() { return this._short; }
  public SlackAttachmentField setShort(Boolean val) { this._short = val; return this; }


  private String _title;
  public String getTitle() { return this._title; }
  public SlackAttachmentField setTitle(String val) { this._title = val; return this; }


  private String _value;
  public String getValue() { return this._value; }
  public SlackAttachmentField setValue(String val) { this._value = val; return this; }

}
