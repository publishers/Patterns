package com.patterns.comand.panel.command.impl;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.model.Stereo;

public class StereoOnCommand implements Command {
	private Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}
