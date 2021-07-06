package com.netfinworks.common.lang;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	/**
     * The empty String {@code ""}.
     * @since 2.0
     */
    public static final String EMPTY = "";
    public static final String EMPTY_STRING = "";

	public static boolean isBlank(String msg) {
		return StringUtils.isBlank(msg);
	}

	public static boolean isNotBlank(String msg) {
		return StringUtils.isNoneBlank(msg);
	}

	public static String substring(final String str, int start, int end) {
		if (str == null) {
            return null;
        }

        // handle negatives
        if (end < 0) {
            end = str.length() + end; // remember end is negative
        }
        if (start < 0) {
            start = str.length() + start; // remember start is negative
        }

        // check length next
        if (end > str.length()) {
            end = str.length();
        }

        // if start is greater than end, return ""
        if (start > end) {
            return EMPTY;
        }

        if (start < 0) {
            start = 0;
        }
        if (end < 0) {
            end = 0;
        }

        return str.substring(start, end);
	}

	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}

	public static boolean equals(String cs1, String cs2) {
		return StringUtils.equals(cs1, cs2);
	}

}
