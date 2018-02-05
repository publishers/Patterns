package com.patterns.proxy.local.state.impl;

import com.patterns.proxy.local.ImageProxy;

import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

public class DefaultImageState implements State {
  private ImageProxy imageProxy;
  private URL imageURL;

  public DefaultImageState(ImageProxy imageProxy) {
    this.imageProxy = imageProxy;
    imageURL = imageProxy.getImageURL();
  }

  @Override
  public int getIconWidth() {
    return 800;
  }

  @Override
  public int getIconHeight() {
    return 600;
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    g.drawString("Loading CD cover, please wait...", x + 300, y + 190);

    Thread retrievalThread = new Thread(() -> {
      try {
        imageProxy.setImageIcon(new ImageIcon(imageURL, "CD Cover"));
        c.repaint();
        imageProxy.setCurrentState(imageProxy.getLoadedImageState());
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
    retrievalThread.start();
  }
}
