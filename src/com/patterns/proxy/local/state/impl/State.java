package com.patterns.proxy.local.state.impl;

import java.awt.Component;
import java.awt.Graphics;

public interface State {
  int getIconWidth();

  int getIconHeight();

  void paintIcon(Component c, Graphics g, int x, int y);
}
