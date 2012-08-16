
package com.opcoach.dsgen.helpers;

public interface DSGenConstants
{

	public static final String DSGEN_FILE_EXT = "dsgen";
	public static final String ECORE_FILE_EXT = "ecore";
	public static final String DSGEN_DOT_EXT = "." + DSGEN_FILE_EXT;

	/** max number of children to create for a default containment EReference */
	public static int MAX_CHILDREN = 50;
	/** max nb of association to bind for a default non containment EReference */
	public static int MAX_ASSOCIATION = 10;

}
