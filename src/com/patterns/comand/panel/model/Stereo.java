package com.patterns.comand.panel.model;

public class Stereo {
  public void on() {
    System.out.println("Stereo on");
  }

  public void off() {
    System.out.println("Stereo off");
  }

  public void setCD(String cd) {
    System.out.println("Stereo cd " + cd);
  }

  public void setDvd(String dvd) {
    System.out.println("Stereo dvd " + dvd);
  }

  public void setRadio(String radio) {
    System.out.println("Stereo radio " + radio);
  }

  public void setVolume(int volume) {
    System.out.println("Stereo volume " + volume);
  }
}
