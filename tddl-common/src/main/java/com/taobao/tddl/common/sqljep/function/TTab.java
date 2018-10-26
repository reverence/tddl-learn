/*****************************************************************************
      SQLJEP - Java SQL Expression Parser 0.2
      November 1 2006
         (c) Copyright 2006, Alexey Gaidukov
      SQLJEP Author: Alexey Gaidukov

      SQLJEP is based on JEP 2.24 (http://www.singularsys.com/jep/)
           (c) Copyright 2002, Nathan Funk
 
      See LICENSE.txt for license information.
*****************************************************************************/

package com.taobao.tddl.common.sqljep.function;




public class TTab extends TBIDGeneratorCommon {

	@Override
	public String getExceptionText(Comparable<?>  param) {
		return WRONG_TYPE+" TTAB("+param.getClass()+")";
	}
	
}

