package com.patterns.comand;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.command.impl.LightOffCommand;
import com.patterns.comand.panel.command.impl.LightOnCommand;
import com.patterns.comand.panel.command.impl.StereoOffCommand;
import com.patterns.comand.panel.command.impl.StereoOnCommand;
import com.patterns.comand.panel.command.impl.TVOffCommand;
import com.patterns.comand.panel.command.impl.TVOnCommand;
import com.patterns.comand.panel.command.impl.macros.MacroCommand;
import com.patterns.comand.panel.control.RemoteController;
import com.patterns.comand.panel.model.Light;
import com.patterns.comand.panel.model.Stereo;
import com.patterns.comand.panel.model.TV;

public class DemoWithMacroCommand {
  public static void main(String[] args) {

    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOffCommand(light);

    TV tv = new TV("TEST LOCATION");
    Command tvOnCommand = new TVOnCommand(tv);
    Command tvOffCommand = new TVOffCommand(tv);

    Stereo stereo = new Stereo();
    Command stereoOnCommand = new StereoOnCommand(stereo);
    Command stereoOffCommand = new StereoOffCommand(stereo);

    Command[] commandPartyOn = {lightOnCommand, tvOnCommand, stereoOnCommand};
    Command[] commandPartyOff = {lightOffCommand, tvOffCommand, stereoOffCommand};
    Command macroCommandPartyOn = new MacroCommand(commandPartyOn);
    Command macroCommandPartyOff = new MacroCommand(commandPartyOff);


    RemoteController controller = new RemoteController();

    controller.setSlot(0, macroCommandPartyOn, macroCommandPartyOff);

    System.out.println("----Start party----");
    controller.buttonOn(0);
    System.out.println("----Finish party----");
    controller.buttonOff(0);
    System.out.println("----End Party----");
  }
}
