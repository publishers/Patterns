package com.patterns.comand;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.command.impl.GarageDoorCloseCommand;
import com.patterns.comand.panel.command.impl.GarageDoorOpenCommand;
import com.patterns.comand.panel.command.impl.LightOffCommand;
import com.patterns.comand.panel.command.impl.LightOnCommand;
import com.patterns.comand.panel.command.impl.StereoOffCommand;
import com.patterns.comand.panel.command.impl.StereoOnCommand;
import com.patterns.comand.panel.command.impl.TVOffCommand;
import com.patterns.comand.panel.command.impl.TVOnCommand;
import com.patterns.comand.panel.command.impl.macros.MacroCommand;
import com.patterns.comand.panel.control.RemoteController;
import com.patterns.comand.panel.model.GarageDoor;
import com.patterns.comand.panel.model.Light;
import com.patterns.comand.panel.model.Stereo;
import com.patterns.comand.panel.model.TV;

public class DemoRunApp {

  private static final int NUMBER_REMOTE_CONTROLLER_BUTTONS = 7;

  public static void main(String[] args) {
    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOffCommand(light);

    GarageDoor garageDoor = new GarageDoor();
    Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

    TV tv = new TV("TEST LOCATION");
    Command tvOnCommand = new TVOnCommand(tv);
    Command tvOffCommand = new TVOffCommand(tv);

    Stereo stereo = new Stereo();
    Command stereoOnCommand = new StereoOnCommand(stereo);
    Command stereoOffCommand = new StereoOffCommand(stereo);

    RemoteController controller = new RemoteController();

    controller.setSlot(0, lightOnCommand, lightOffCommand);
    controller.setSlot(1, garageDoorOpenCommand, garageDoorCloseCommand);
    controller.setSlot(2, tvOnCommand, tvOffCommand);
    controller.setSlot(3, stereoOnCommand, stereoOffCommand);

    for (int i = 0; i < NUMBER_REMOTE_CONTROLLER_BUTTONS; i++) {
      checkRemoteControl(controller, i);
    }
  }

  private static void checkRemoteControl(RemoteController controller, int remoteControllerButton) {
    controller.buttonOn(remoteControllerButton);
    controller.buttonOff(remoteControllerButton);
  }
}
