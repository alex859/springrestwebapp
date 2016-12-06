package org.alex859.springrestwebapp.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Test
{
	public static void main(String[] args)
	{
		final Map<Integer, Function<Integer, Integer>> map = new HashMap<>();
		map.put(1, f1(1));
		long t1 = System.nanoTime();
		for (int i = 0; i < 1_000_000_000; i++)
		{
//			f2(1, 2);
			map.computeIfAbsent(1, Test::f1).apply(2);
			f1(1).apply(2);
//			map.get(1).apply(2);
		}

		long t2 = System.nanoTime();

		System.out.println(TimeUnit.NANOSECONDS.toMillis(t2-t1));
		//f1(1).apply(2);
	}



	private static Integer f2(final Integer a, final Integer b)
	{
		return a + b;
	}

	private static Function<Integer, Integer> f1(final Integer a)
	{
		return b -> f2(a, b);
	}
}
