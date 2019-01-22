/* ====================================================================
 * The JRefactory License, Version 1.0
 *
 * Copyright (c) 2001 JRefactory.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        JRefactory (http://www.sourceforge.org/projects/jrefactory)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "JRefactory" must not be used to endorse or promote
 *    products derived from this software without prior written
 *    permission. For written permission, please contact seguin@acm.org.
 *
 * 5. Products derived from this software may not be called "JRefactory",
 *    nor may "JRefactory" appear in their name, without prior written
 *    permission of Chris Seguin.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE CHRIS SEGUIN OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of JRefactory.  For more information on
 * JRefactory, please see
 * <http://www.sourceforge.org/projects/jrefactory>.
 */
package org.acm.seguin.uml;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

/**
 *  Draws the class symbol
 *
 *@author     Chris Seguin
 *@created    September 12, 2001
 */
public class ClassIcon extends UMLIcon {
    /**
     *  Constructor for the ClassIcon object
     *
     *@param  wide  the size of the icon
     *@param  high  the size of the icon
     */
    public ClassIcon(int wide, int high) {
        super(wide, high);
    }


    /**
     *  Draws the icon
     *
     *@param  c  The component on which we are drawing
     *@param  g  The graphics object
     *@param  x  the x location
     *@param  y  the y location
     */
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //  Set the color to black
        g.setColor(Color.black);

        //  Draw the icons
        int scaledHeight = (int) (scale * iconHeight);
        int scaledWidth = (int) (scale * iconWidth);
        int scaledMargin = (int) (scale);

        int third = scaledHeight / 3;
        g.drawRect(x + scaledMargin, y, scaledWidth, scaledHeight);
        g.drawLine(x + scaledMargin, y + third, x + scaledMargin + scaledWidth, y + third);
        g.drawLine(x + scaledMargin, y + 2 * third, x + scaledMargin + scaledWidth, y + 2 * third);
    }
}
