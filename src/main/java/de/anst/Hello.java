package de.anst;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Inspect java context.
 * 
 * @author Antonius
 *
 */
public class Hello {
	/**
	 * @param args String... Unused args.
	 */
	public static void main(String... args) {
		System.out.println("Hello from " + System.getProperty("user.name"));

		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		System.out.println( "BootClassPathSupported: " + runtimeMXBean.isBootClassPathSupported());
		if ( runtimeMXBean.isBootClassPathSupported()) {
			System.out.println( "BootClassPath: " + runtimeMXBean.getBootClassPath());
		}
		System.out.println( "ClassPath: " + runtimeMXBean.getClassPath());
		System.out.println( "LibraryPath: " + runtimeMXBean.getManagementSpecVersion());
		System.out.println( "Name: " + runtimeMXBean.getName());
		System.out.println( "Pid: " + runtimeMXBean.getPid());
		System.out.println( "SpecName: " + runtimeMXBean.getSpecName());
		System.out.println( "SpecVendor: " + runtimeMXBean.getSpecVendor());
		System.out.println( "SpecVersion: " + runtimeMXBean.getSpecVersion());
		System.out.println( "TimeZone: " + ZoneId.systemDefault());
		System.out.println( "StartTime: " + Instant.ofEpochMilli(runtimeMXBean.getStartTime()).atZone(ZoneId.systemDefault()).toLocalDateTime());
		System.out.println( "UpTime: " + runtimeMXBean.getUptime() + " ms");
		System.out.println( "VmName: " + runtimeMXBean.getVmName());
		System.out.println( "VmVendor: " + runtimeMXBean.getVmVendor());
		System.out.println( "VmVersion: " + runtimeMXBean.getVmVersion());
		System.out.println( "InputArguments: " + runtimeMXBean.getInputArguments());
		System.out.println( "Class.SimpleName: " + runtimeMXBean.getClass().getName());
		System.out.println( "Systemproperties: " + runtimeMXBean.getSystemProperties());
		System.out.println( "ObjectName:.PropertyList " + runtimeMXBean.getObjectName().getKeyPropertyListString());
		System.out.println( "Environment: " + System.getenv());

	}
}
