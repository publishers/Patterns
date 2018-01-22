package com.patterns.comand.panel.control;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.command.impl.NoCommand;

public class RemoteController {
  private Command[] onCommands;
  private Command[] offCommands;
  private Command undoCommand;

  public RemoteController() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];
    Command noCommand = new NoCommand();
    undoCommand = noCommand;

    init(onCommands, noCommand);
    init(offCommands, noCommand);
  }

  private void init(Command[] commands, Command noCommand) {
    for (int i = 0; i < 7; i++) {
      commands[i] = noCommand;
    }
  }

  public void setSlot(int slot, Command commandOn, Command commandOff) {
    onCommands[slot] = commandOn;
    offCommands[slot] = commandOff;
  }

  public void buttonOn(int slot) {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void buttonOff(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoCommand() {
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder stringBuff = new StringBuilder();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append("[slot ")
              .append(i)
              .append("] ")
              .append(onCommands[i].getClass().getName())
              .append("    ")
              .append(offCommands[i].getClass().getName())
              .append("\n");
    }
    return stringBuff.toString();
  }
}
