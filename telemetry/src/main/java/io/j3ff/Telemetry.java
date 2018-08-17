package io.j3ff;

public class Telemetry {

  private final Core core;

  public Telemetry() {
    this.core = new Core("Telemetry");
  }

  public String getCoreName() {
    return core.toString();
  }
}
