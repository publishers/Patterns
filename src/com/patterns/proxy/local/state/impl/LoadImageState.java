package com.patterns.proxy.local.state.impl;

import com.patterns.proxy.local.ImageProxy;

import java.awt.Component;
import java.awt.Graphics;

public class LoadImageState implements State {

  private ImageProxy imageProxy;

  public LoadImageState(ImageProxy imageProxy) {
    this.imageProxy = imageProxy;
  }

  @Override
  public int getIconWidth() {
    return imageProxy.getImageIcon().getIconWidth();
  }

  @Override
  public int getIconHeight() {
    return imageProxy.getImageIcon().getIconHeight();
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    imageProxy.getImageIcon().paintIcon(c, g, x, y);
  }
}
