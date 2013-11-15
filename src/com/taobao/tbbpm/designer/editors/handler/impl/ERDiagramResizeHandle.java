package com.taobao.tbbpm.designer.editors.handler.impl;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.handles.ResizeHandle;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author junyu.wy
 * 
 */
public class ERDiagramResizeHandle extends ResizeHandle {
	public ERDiagramResizeHandle(GraphicalEditPart owner, int direction) {
		super(owner, direction);
	}

	@Override
	protected void init() {
		setPreferredSize(new Dimension(7, 7));
	}

	@Override
	protected Color getBorderColor() {
		return ColorConstants.gray;
	}

	@Override
	protected Color getFillColor() {
		return ColorConstants.white;
	}
}