package com.patterns.comand.panel.command.impl;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.model.GarageDoor;

public class GarageDoorCloseCommand implements Command {
  private GarageDoor garageDoor;

  public GarageDoorCloseCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.down();
  }

  @Override
  public void undo() {
    garageDoor.up();
  }
}
