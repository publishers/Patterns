package com.patterns.comand.panel.command.impl;

import com.patterns.comand.panel.command.Command;

public class NoCommand implements Command {
  @Override
  public void execute() {
    System.out.println("do nothing");
  }

  @Override
  public void undo() {
    System.out.println("do nothing");
  }
}
