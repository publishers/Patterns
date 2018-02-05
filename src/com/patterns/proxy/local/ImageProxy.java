package com.patterns.proxy.local;

import com.patterns.proxy.local.state.impl.DefaultImageState;
import com.patterns.proxy.local.state.impl.LoadImageState;
import com.patterns.proxy.local.state.impl.State;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

public class ImageProxy implements Icon {
  private ImageIcon imageIcon;
  private URL imageURL;
  private State currentState;
  private State defaultImageState;
  private State loadImageState;

  public ImageProxy(URL url) {
    imageURL = url;
    defaultImageState = new DefaultImageState(this);
    loadImageState = new LoadImageState(this);
    currentState = defaultImageState;
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y) {
    currentState.paintIcon(c, g, x, y);
  }

  @Override
  public int getIconWidth() {
    return currentState.getIconWidth();
  }

  @Override
  public int getIconHeight() {
    return currentState.getIconHeight();
  }

  public URL getImageURL() {
    return imageURL;
  }

  public State getLoadedImageState() {
    return loadImageState;
  }

  public void setImageIcon(ImageIcon imageIcon) {
    this.imageIcon = imageIcon;
  }

  public ImageIcon getImageIcon() {
    return imageIcon;
  }

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }
}
