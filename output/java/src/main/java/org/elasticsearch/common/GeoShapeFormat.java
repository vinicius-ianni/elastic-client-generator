
package org.elasticsearch.common;

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum GeoShapeFormat implements XContentable<GeoShapeFormat> {
  GeoJson("GeoJson"),
    WellKnownText("WellKnownText");
  private final String textRepresentation;

  private GeoShapeFormat(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public GeoShapeFormat fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, GeoShapeFormat, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "GeoJson": return GeoShapeFormat.GeoJson;
      case "WellKnownText": return GeoShapeFormat.WellKnownText;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, GeoShapeFormat.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
