/******************************************************************************* 
 * Copyright (c) 2007 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/ 
package org.jboss.tools.common.el.core.model;

/**
 * Kind of invocation in which argument is represented as
 * '[' expression ']'.
 * Details are returned by method getArgument().
 * 
 * @author V. Kabanovich
 */
public interface ELArgumentInvocation extends ELInvocationExpression {

	public ELArgument getArgument();

}
