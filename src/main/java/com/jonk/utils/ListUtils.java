package com.jonk.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * List操作工具类
 * 
 * @author LiuJunGuang
 * @date 2016年6月7日下午4:12:42
 */
public class ListUtils {
	/**
	 * 根据指定的大小拆分列表
	 * 
	 * @author LiuJunGuang
	 * @param list 需要拆分的列表
	 * @param size 每个子列表最大元素个数
	 * @return 拆分之后的列表
	 * @date 2014年8月25日下午6:57:34
	 */
	public static <T> List<List<T>> split(List<T> list, int size) {
		if (list == null || list.size() == 0)
			return null;
		List<List<T>> splitList = new LinkedList<List<T>>();

		int listSize = list.size();
		for (int i = 0; i < Math.ceil(listSize / Double.valueOf(size)); i++) {
			int end = (i + 1) * size > listSize ? listSize : (i + 1) * size;
			List<T> subList = list.subList(i * size, end);
			splitList.add(subList);
		}
		return splitList;
	}
}