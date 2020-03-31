
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

public enum FollowerIndexStatus {
  Active("active"),
    Paused("paused");
  private final String textRepresentation;

  private FollowerIndexStatus(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
