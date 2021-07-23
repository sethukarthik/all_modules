package com.all_modules.terminal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class ChennaiTerminal {
	private int counter;
	private String flightName;
	private String depature;
	
	public ChennaiTerminal() {
		
	}
	
	public ChennaiTerminal(int counter, String flightName, String depature) {
		this.counter = counter;
		this.flightName = flightName;
		this.depature = depature;
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getdepature() {
		return depature;
	}

	public void setdepature(String depature) {
		this.depature = depature;
	}
	
	static String getCurrentTime() {
		LocalDateTime date = LocalDateTime.now();
		String depature = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(date);
		return depature;
	}

	@Override
	public String toString() {
		return "ChennaiTerminal [counter=" + counter + ", flightName=" + flightName + ", depature=" + depature + "]";
	}

	public static void main(String[] args) {		
		ChennaiTerminal airAsia = null;
		Optional<ChennaiTerminal> op = Optional.ofNullable(airAsia);
		System.out.println(op);
		//This does not required interface and we can create object directly
		ChennaiTerminal airIndia = op.orElse(new ChennaiTerminal(2, "Air India", getCurrentTime()));
		//This contains supplier interface and we can do an action 
		ChennaiTerminal airIndiaSupplier = op.orElseGet(() -> new ChennaiTerminal(2, "Air India", getCurrentTime()));
		if(op.isPresent()) {
			System.out.println("Yes it is");
		}else {
			System.out.println("No it is not");
		}
		//orElseThrow will throw exception
//		ChennaiTerminal airIndiaExcep = op.orElseThrow(NullPointerException::new);
		System.out.println(airIndia);
	}
}
