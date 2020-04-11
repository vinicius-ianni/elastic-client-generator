
package org.elasticsearch.common_options.date_math;

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum DateMathTimeUnit implements XContentable<DateMathTimeUnit> {
  Seconds("s"),
    Minutes("m"),
    Hours("h"),
    Days("d"),
    Weeks("w"),
    Months("M"),
    Years("y");
  private final String textRepresentation;

  private DateMathTimeUnit(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public DateMathTimeUnit fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, DateMathTimeUnit, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "s": return DateMathTimeUnit.Seconds;
      case "m": return DateMathTimeUnit.Minutes;
      case "h": return DateMathTimeUnit.Hours;
      case "d": return DateMathTimeUnit.Days;
      case "w": return DateMathTimeUnit.Weeks;
      case "M": return DateMathTimeUnit.Months;
      case "y": return DateMathTimeUnit.Years;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, DateMathTimeUnit.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
