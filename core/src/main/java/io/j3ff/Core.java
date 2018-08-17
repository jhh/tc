package io.j3ff;

public class Core {

  private final String name;

  public Core(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
