
package org.elasticsearch.x_pack.watcher.action.slack;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.action.slack.*;
import org.elasticsearch.internal.*;

public class SlackAttachment  {
  
  private String _authorIcon;
  public String getAuthorIcon() { return this._authorIcon; }
  public SlackAttachment setAuthorIcon(String val) { this._authorIcon = val; return this; }


  private String _authorLink;
  public String getAuthorLink() { return this._authorLink; }
  public SlackAttachment setAuthorLink(String val) { this._authorLink = val; return this; }


  private String _authorName;
  public String getAuthorName() { return this._authorName; }
  public SlackAttachment setAuthorName(String val) { this._authorName = val; return this; }


  private String _color;
  public String getColor() { return this._color; }
  public SlackAttachment setColor(String val) { this._color = val; return this; }


  private String _fallback;
  public String getFallback() { return this._fallback; }
  public SlackAttachment setFallback(String val) { this._fallback = val; return this; }


  private SlackAttachmentField[] _fields;
  public SlackAttachmentField[] getFields() { return this._fields; }
  public SlackAttachment setFields(SlackAttachmentField[] val) { this._fields = val; return this; }


  private String _footer;
  public String getFooter() { return this._footer; }
  public SlackAttachment setFooter(String val) { this._footer = val; return this; }


  private String _footerIcon;
  public String getFooterIcon() { return this._footerIcon; }
  public SlackAttachment setFooterIcon(String val) { this._footerIcon = val; return this; }


  private String _imageUrl;
  public String getImageUrl() { return this._imageUrl; }
  public SlackAttachment setImageUrl(String val) { this._imageUrl = val; return this; }


  private String _pretext;
  public String getPretext() { return this._pretext; }
  public SlackAttachment setPretext(String val) { this._pretext = val; return this; }


  private String _text;
  public String getText() { return this._text; }
  public SlackAttachment setText(String val) { this._text = val; return this; }


  private String _thumbUrl;
  public String getThumbUrl() { return this._thumbUrl; }
  public SlackAttachment setThumbUrl(String val) { this._thumbUrl = val; return this; }


  private String _title;
  public String getTitle() { return this._title; }
  public SlackAttachment setTitle(String val) { this._title = val; return this; }


  private String _titleLink;
  public String getTitleLink() { return this._titleLink; }
  public SlackAttachment setTitleLink(String val) { this._titleLink = val; return this; }


  private Date _ts;
  public Date getTs() { return this._ts; }
  public SlackAttachment setTs(Date val) { this._ts = val; return this; }

}
