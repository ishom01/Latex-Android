package com.ishom.jlatexmath.swing;

import com.ishom.jlatexmath.awt.Component;
import com.ishom.jlatexmath.awt.Graphics;


public interface Icon {
    void paintIcon(Component c, Graphics g, int x, int y);

    int getIconWidth();

    int getIconHeight();
}

