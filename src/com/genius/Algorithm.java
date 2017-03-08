package com.genius;

import javax.imageio.ImageReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class Algorithm {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 1; i < 10; i++) {
//			out.printf("%d * %d = %d \n", n, i, i * n);
//		}

		ProcessHandle self = ProcessHandle.current();
		long PID = self.getPid();
		ProcessHandle.Info procInfo = self.info();

		Optional<String[]> arguments = procInfo.arguments();
		Optional<String> cmd = procInfo.commandLine();
		Optional<Instant> startTime = procInfo.startInstant();
		Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

		//System.out.println(Arrays.toString(arguments.get()));
		System.out.println(cmd);
		System.out.println(startTime);
		System.out.println(cpuUsage);


		
	}

	@Override
	public void close() throws Exception {

	}
}