package com.coding.ninja.linked.list;

import org.junit.Test;

import junit.framework.Assert;

public class LinkedListTest {

	@Test
	public void addMidTest() {
		LinkList1 ll = add(5);
		int data =7;
		int pos =3;
		ll.addMid(data, pos);
		Assert.assertEquals(data, ll.find(pos+1).data);
	}
	
	@Test
	public void addTest() {
		LinkList1 ll = add(5);
		Assert.assertEquals(5, ll.size());
	}
	@Test
	public void removeLastTest() {
		LinkList1 ll = add(5);
		ll.removeLast();
		Assert.assertEquals(4, ll.size());
	}
	@Test
	public void removeFirstTest() {
		LinkList1 ll = add(5);
		ll.removeFirst();
		Assert.assertEquals(4, ll.size());
	}
	
	@Test
	public void test() {
		LinkList ll = add1();
		ll.removeDuplicates(ll.head);
	}

	@Test
	public void test1() {
		LinkList ll = add2();
		ll.print(ll.head);
		System.out.println("\n After sorting");
		ll.bubbleSort(ll.head);
	}
	
	@Test
	public void testMid() {
		LinkList ll = add2();
		ll.print(ll.head);
		;
		System.out.println("\n " + ll.printMiddel(ll.head));
	}
	
	@Test
	public void addMidTestOutofRange() {
		LinkList1 ll = add(5);
		int data =7;
		int pos =6;
		ll.addMid(data, pos);
		Assert.assertNull(ll.find(pos+1));
		Assert.assertEquals(5, ll.size());
		
	}
	
	private LinkList1 add(int range) {
		LinkList1 ll = new LinkList1();
		for (int i = 0; i < range; i++) {
			ll.addLast(i);
		}

		return ll;
	}
	private LinkList add1() {
		LinkList ll = new LinkList();
		
		ll.addLast(281);
		ll.addLast(386);
		ll.addLast(386);
		ll.addLast(957);
		ll.addLast(1022);
		ll.addLast(1216);
		ll.addLast(1232);
		ll.addLast(1364);
		ll.addLast(1428);
		ll.addLast(1428);
		ll.addLast(1428);
		ll.addLast(1428);
		ll.addLast(1501);
		ll.addLast(1950);
		return ll;
	}
	private LinkList add2() {
		LinkList ll = new LinkList();
		
		ll.addLast(5);
		ll.addLast(1);
		ll.addLast(6);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(7);
		ll.addLast(1);
		return ll;
	}
}
