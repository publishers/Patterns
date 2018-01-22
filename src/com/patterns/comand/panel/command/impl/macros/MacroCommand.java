package com.patterns.comand.panel.command.impl.macros;

import com.patterns.comand.panel.command.Command;

import java.util.stream.Stream;

public class MacroCommand implements Command {
  private Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    Stream.of(commands).forEach(Command::execute);
  }

  @Override
  public void undo() {
    Stream.of(commands).forEach(Command::undo);
  }
}
