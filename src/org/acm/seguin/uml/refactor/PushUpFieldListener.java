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
package org.acm.seguin.uml.refactor;

import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import org.acm.seguin.refactor.Refactoring;
import org.acm.seguin.refactor.RefactoringException;
import org.acm.seguin.refactor.RefactoringFactory;
import org.acm.seguin.refactor.field.PushUpFieldRefactoring;
import org.acm.seguin.summary.FieldSummary;
import org.acm.seguin.summary.TypeSummary;
import org.acm.seguin.uml.PopupMenuListener;
import org.acm.seguin.uml.UMLPackage;
import org.acm.seguin.uml.loader.ReloaderSingleton;

/**
 *  Pushes a field into the parent class
 *
 *@author     Chris Seguin
 *@created    September 12, 2001
 */
public class PushUpFieldListener extends NoInputRefactoringListener {
    private TypeSummary typeSummary;
    private String name;


    /**
     *  Constructor for the PushUpFieldListener object
     *
     *@param  initPackage   the UML package that is being operated on
     *@param  initType      the type that is being removed
     *@param  initMenu      The popup menu
     *@param  initItem      The current item
     *@param  fieldSummary  Description of the Parameter
     */
    public PushUpFieldListener(UMLPackage initPackage,
            TypeSummary initType, FieldSummary fieldSummary,
            JPopupMenu initMenu, JMenuItem initItem) {
        super(initPackage, initMenu, initItem);
        typeSummary = initType;
        name = fieldSummary.getName();
        if (typeSummary == null) {
            typeSummary = (TypeSummary) fieldSummary.getParent();
        }
    }


    /**
     *  Creates a refactoring to be performed
     *
     *@return    the refactoring
     */
    protected Refactoring createRefactoring() {
        PushUpFieldRefactoring puff = RefactoringFactory.get().pushUpField();
        puff.setClass(typeSummary);
        puff.setField(name);
        return puff;
    }
}
