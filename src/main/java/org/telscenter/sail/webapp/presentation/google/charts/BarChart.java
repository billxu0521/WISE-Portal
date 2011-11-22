/**
 * Copyright (c) 2008 Regents of the University of California (Regents). Created
 * by TELS, Graduate School of Education, University of California at Berkeley.
 *
 * This software is distributed under the GNU Lesser General Public License, v2.
 *
 * Permission is hereby granted, without written agreement and without license
 * or royalty fees, to use, copy, modify, and distribute this software and its
 * documentation for any purpose, provided that the above copyright notice and
 * the following two paragraphs appear in all copies of this software.
 *
 * REGENTS SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE. THE SOFTWAREAND ACCOMPANYING DOCUMENTATION, IF ANY, PROVIDED
 * HEREUNDER IS PROVIDED "AS IS". REGENTS HAS NO OBLIGATION TO PROVIDE
 * MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 *
 * IN NO EVENT SHALL REGENTS BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
 * SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
 * ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
 * REGENTS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.telscenter.sail.webapp.presentation.google.charts;

/**
 * A BarChart is a Bar Graph type of a GoogleChart.
 * 
 * @author patrick lawler
 * @version $Id:$
 */
public interface BarChart extends GoogleChart{

	/**
	 * Sets the orientation of the bars <code>String</code> h (horizontal)
	 * or v (vertical) are the only two options allowed, all others will
	 * throw an exception.
	 * 
	 * @param <code>String</code> orientation
	 * @throws <code>Exception</code>
	 */
	public void setOrientation(String orientation) throws Exception;
	
	/**
	 * Sets <code>boolean</code> whether the bars are grouped - dependent
	 * on the number of data sets.
	 * 
	 * @param <code>boolean</code> b
	 */
	public void setGrouped(boolean b);
	
}
