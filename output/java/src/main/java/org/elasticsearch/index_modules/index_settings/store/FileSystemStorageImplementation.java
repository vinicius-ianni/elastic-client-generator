
package org.elasticsearch.index_modules.index_settings.store;

public enum FileSystemStorageImplementation {
  Simplefs("simplefs"),
    Niofs("niofs"),
    Mmapfs("mmapfs"),
    DefaultFs("default_fs");
  private final String textRepresentation;

  private FileSystemStorageImplementation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }
}
