package com.smartfoodhcmut.paging;

import com.smartfoodhcmut.sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
