
package org.elasticsearch.x_pack.machine_learning.job.detectors;

public enum MetricFunction {
  Min("Min"),
    Max("Max"),
    Median("Median"),
    HighMedian("HighMedian"),
    LowMedian("LowMedian"),
    Mean("Mean"),
    HighMean("HighMean"),
    LowMean("LowMean"),
    Metric("Metric"),
    Varp("Varp"),
    HighVarp("HighVarp"),
    LowVarp("LowVarp");
  private final String textRepresentation;

  private MetricFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
