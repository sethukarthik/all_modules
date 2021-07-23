package com.all_modules.all_interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerInterface {
	int inp1;
	
	public ConsumerInterface() {
	}
	
	public ConsumerInterface(int inp1) {
		this.inp1 = inp1;
	}

	public int getInp1() {
		System.out.println(this.inp1);
		return inp1;
	}

	public void setInp1(int inp1) {
		this.inp1 = inp1;
	}
	
	static void disList(List<Integer> list) {
		//Consumer to display number of list
		Consumer<List<Integer>> disList = (l) -> l.forEach(a -> System.out.println(a));
		disList.accept(list);
	}

	static void consumer(List<Integer> l) {
		// Add integer to an integer
		Consumer<List<Integer>> modify = (list) -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 2 * list.get(i));
			}
		};
		modify.accept(l);
	}

	static final void multipleInt(int i) {
		ConsumerInterface name = new ConsumerInterface();
		Consumer<Integer> mul = (da) -> {
			name.setInp1(da * 2);
		};
		mul.accept(i);
		System.out.println(name.getInp1());
	}
	
	static void andThenCon(List<Integer> lst) {
		// Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list -> {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
  
        // Consumer to display a list of integers
        Consumer<List<Integer> >
            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
  
        // using addThen()
        modify.andThen(dispList).accept(lst);
	}

	public static void main(String[] args) {
		ConsumerInterface.multipleInt(10);
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
//		ConsumerInterface.consumer(lst);
//		ConsumerInterface.disList(lst);
		ConsumerInterface.andThenCon(lst);
		
		Consumer<String> con = (par) -> System.out.println(par);
		con.accept("Sethu");
		List<String> cons = new ArrayList<>();
		cons.add("a");
		cons.add("b");
		cons.add("c");
		cons.forEach(System.out::printf);
		List<ConsumerInterface> conIn = new ArrayList<>();
		conIn.add(new ConsumerInterface(1));
		conIn.add(new ConsumerInterface(2));
		conIn.add(new ConsumerInterface(3));
		conIn.add(new ConsumerInterface(4));
		conIn.add(new ConsumerInterface(5));
		conIn.add(new ConsumerInterface(6));
		
		conIn.forEach((c) -> c.getInp1());
		
		ConsumerInterface c = null;
		
		Optional<ConsumerInterface> op = Optional.of(new ConsumerInterface(3));
		ConsumerInterface intf = op.get();
//		if(op.isPresent()) {
//			System.out.println("it is present");
//		}else {
//			ConsumerInterface intf = op.orElseGet(() -> new ConsumerInterface(7));
			System.out.println(intf);
//		}
	}

	@Override
	public String toString() {
		return "ConsumerInterface [inp1=" + inp1 + "]";
	}
}
