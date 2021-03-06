/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.common.meta.action.impl;

import org.jboss.tools.common.meta.*;
import org.jboss.tools.common.meta.action.*;
import org.jboss.tools.common.model.*;

public class SignificanceMessageImpl implements SignificanceMessage {

    public String getMessage(XAction action, XModelObject object, XModelObject[] objects) {
        String d = action.getDisplayName();
        if(d.endsWith("...")) d = d.substring(d.length() - 3); //$NON-NLS-1$
        XAttribute e = object.getModelEntity().getAttribute(XModelObjectConstants.ATTR_ELEMENT_TYPE);
        String type = (e == null || !e.isVisible()) ? "" : object.getAttributeValue(XModelObjectConstants.ATTR_ELEMENT_TYPE); //$NON-NLS-1$
        if(type.length() > 0) type += " "; //$NON-NLS-1$
        String what = (objects != null && objects.length > 1) ? objects.length + " selected objects" :
                      type + "'" + object.getPresentationString() + "'"; //$NON-NLS-1$ //$NON-NLS-2$
        return d + " " + what;
    }

}

