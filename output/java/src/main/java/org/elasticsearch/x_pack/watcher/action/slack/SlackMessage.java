
package org.elasticsearch.x_pack.watcher.action.slack;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.slack.*;

public class SlackMessage  {
  
  private SlackAttachment[] _attachments;
  public SlackAttachment[] getAttachments() { return this._attachments; }
  public SlackMessage setAttachments(SlackAttachment[] val) { this._attachments = val; return this; }


  private SlackDynamicAttachment _dynamicAttachments;
  public SlackDynamicAttachment getDynamicAttachments() { return this._dynamicAttachments; }
  public SlackMessage setDynamicAttachments(SlackDynamicAttachment val) { this._dynamicAttachments = val; return this; }


  private String _from;
  public String getFrom() { return this._from; }
  public SlackMessage setFrom(String val) { this._from = val; return this; }


  private String _icon;
  public String getIcon() { return this._icon; }
  public SlackMessage setIcon(String val) { this._icon = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public SlackMessage setText(String val) { this._text = val; return this; }


  private String[] _to;
  public String[] getTo() { return this._to; }
  public SlackMessage setTo(String[] val) { this._to = val; return this; }

}
