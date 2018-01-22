package com.patterns.comand.panel.command.impl;

import com.patterns.comand.panel.command.Command;
import com.patterns.comand.panel.model.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
	}
}
