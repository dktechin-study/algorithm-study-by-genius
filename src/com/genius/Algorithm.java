package com.genius;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Random;

public class Algorithm {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 1; i < 10; i++) {
//			out.printf("%d * %d = %d \n", n, i, i * n);
//		}

//		ProcessHandle self = ProcessHandle.current();
//		long PID = self.getPid();
//		ProcessHandle.Info procInfo = self.info();
//
//		Optional<String[]> arguments = procInfo.arguments();
//		Optional<String> cmd = procInfo.commandLine();
//		Optional<Instant> startTime = procInfo.startInstant();
//		Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
//
//		//System.out.println(Arrays.toString(arguments.get()));
//		System.out.println(cmd);
//		System.out.println(startTime);
//		System.out.println(cpuUsage);

		Integer[] d = new Integer[]{0, 1};
		//System.out.println(Arrays.asList(d).stream().allMatch(b -> b == 0));

		String s = "";
		nonnull(s);

//
//		BitSet bits1 = new BitSet(16);
//		BitSet bits2 = new BitSet(16);
//
//
//		bits1.set(0,3);
//		bits2.set(2);
//
//
//		System.out.println(bits1);
//		System.out.println(bits2);
//
//		bits1.xor(bits2);
//
//		System.out.println(bits1);
//
//		bits1.or(bits2);
//
//		System.out.println(bits1);


		BigInteger bi = BigInteger.probablePrime(5, new Random(100));
		System.out.println(bi);
	}


	public static String nonnull(@Nonnull String s) {
		return s;
	}
}