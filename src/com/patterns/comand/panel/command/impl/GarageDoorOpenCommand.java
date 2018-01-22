package com.patterns.comand.panel.command.impl;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.model.GarageDoor;

public class GarageDoorOpenCommand implements Command {
  private GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }

  @Override
  public void undo() {
    garageDoor.down();
  }
}
