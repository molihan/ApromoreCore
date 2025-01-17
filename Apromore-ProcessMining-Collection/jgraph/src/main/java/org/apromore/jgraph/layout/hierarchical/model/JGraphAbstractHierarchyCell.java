/*-
 * #%L
 * This file is part of "Apromore Core".
 * %%
 * Copyright (C) 2018 - 2022 Apromore Pty Ltd.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
/*
 * Copyright (c) 2005, David Benson
 *
 * All rights reserved.
 *
 * This file is licensed under the JGraph software license, a copy of which
 * will have been provided to you in the file LICENSE at the root of your
 * installation directory. If you are unable to locate this file please
 * contact JGraph sales for another copy.
 */
package org.apromore.jgraph.layout.hierarchical.model;

import java.util.List;

/**
 * An abstraction of an internal hierarchy node or edge
 */
public abstract class JGraphAbstractHierarchyCell {

	/**
	 * The maximum rank this cell occupies
	 */
	public int maxRank = -1;

	/**
	 * The minimum rank this cell occupies
	 */
	public int minRank = -1;

	/**
	 * The x position of this cell for each layer it occupies
	 */
	public double x[] = new double[1];

	/**
	 * The y position of this cell for each layer it occupies
	 */
	public double y[] = new double[1];

	/**
	 * The width of this cell
	 */
	public double width = 0.0;

	/**
	 * The height of this cell
	 */
	public double height = 0.0;

	/**
	 * A cached version of the cells this cell connects to on the next layer up
	 */
	protected List nextLayerConnectedCells[] = null;

	/**
	 * A cached version of the cells this cell connects to on the next layer down
	 */
	protected List previousLayerConnectedCells[] = null;

	/**
	 * Temporary variable for general use. Generally, try to avoid
	 * carrying information between stages. Currently, the longest
	 * path layering sets temp to the rank position in fixRanks()
	 * and the crossing reduction uses this. This meant temp couldn't
	 * be used for hashing the nodes in the model dfs and so hashCode
	 * was created
	 */
	public int[] temp = new int[1];

	/**
	 * Returns the cells this cell connects to on the next layer up
	 * @param layer the layer this cell is on
	 * @return the cells this cell connects to on the next layer up
	 */
	public abstract List getNextLayerConnectedCells(int layer);

	/**
	 * Returns the cells this cell connects to on the next layer down
	 * @param layer the layer this cell is on
	 * @return the cells this cell connects to on the next layer down
	 */
	public abstract List getPreviousLayerConnectedCells(int layer);

	/**
	 * 
	 * @return whether or not this cell is an edge
	 */
	public abstract boolean isEdge();

	/**
	 * 
	 * @return whether or not this cell is a node
	 */
	public abstract boolean isVertex();

	/**
	 * Gets the value of temp for the specified layer
	 * 
	 * @param layer
	 *            the layer relating to a specific entry into temp
	 * @return the value for that layer
	 */
	public abstract int getGeneralPurposeVariable(int layer);

	/**
	 * Set the value of temp for the specified layer
	 * 
	 * @param layer
	 *            the layer relating to a specific entry into temp
	 * @param value
	 *            the value for that layer
	 */
	public abstract void setGeneralPurposeVariable(int layer, int value);

	/**
	 * Set the value of x for the specified layer
	 * 
	 * @param layer
	 *            the layer relating to a specific entry into x[]
	 * @param value
	 *            the x value for that layer
	 */
	public void setX(int layer, double value) {
		if (isVertex()) {
			x[0] = value;
		} else if (isEdge()) {
			x[layer - minRank - 1] = value;
		}
	}

	/**
	 * Gets the value of x on the specified layer
	 * @param layer the layer to obtain x for
	 * @return the value of x on the specified layer
	 */
	public double getX(int layer) {
		if (isVertex()) {
			return x[0];
		} else if (isEdge()) {
			return x[layer - minRank - 1];
		}

		return 0.0;
	}

	/**
	 * Set the value of y for the specified layer
	 * 
	 * @param layer
	 *            the layer relating to a specific entry into y[]
	 * @param value
	 *            the y value for that layer
	 */
	public void setY(int layer, double value) {
		if (isVertex()) {
			y[0] = value;
		} else if (isEdge()) {
			y[layer - minRank - 1] = value;
		}
	}
}
