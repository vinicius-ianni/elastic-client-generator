
package org.elasticsearch.ingest.processors;

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum DateRounding implements XContentable<DateRounding> {
  Seconds("s"),
    Minutes("m"),
    Hours("h"),
    Days("d"),
    Weeks("w"),
    Months("M"),
    Years("y");
  private final String textRepresentation;

  private DateRounding(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public DateRounding fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, DateRounding, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "s": return DateRounding.Seconds;
      case "m": return DateRounding.Minutes;
      case "h": return DateRounding.Hours;
      case "d": return DateRounding.Days;
      case "w": return DateRounding.Weeks;
      case "M": return DateRounding.Months;
      case "y": return DateRounding.Years;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, DateRounding.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
