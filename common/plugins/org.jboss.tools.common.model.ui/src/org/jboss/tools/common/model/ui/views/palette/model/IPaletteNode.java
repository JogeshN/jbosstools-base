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
package org.jboss.tools.common.model.ui.views.palette.model;

import org.eclipse.swt.graphics.Image;
import org.jboss.tools.common.model.XModelObject;

public interface IPaletteNode {
	String getTitle();
	Image getImage();
	String getDescription();
	XModelObject getXModelObject();
	IPaletteNode[] getChildren();
	void setImage(Image image);
	IPaletteNode addChild(IPaletteNode node);
}
