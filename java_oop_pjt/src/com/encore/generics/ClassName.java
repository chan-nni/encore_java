package com.encore.generics;
/*

타입 - <T> : Type , <E> : Element , <K> : Key , <V> : Value , <N> : Number

*/
/*
public class ClassName<T , K> {

}
*/
/*
public class ClassName<T> {

}
*/
/*
public class ClassName<E> {
	private E element ; 
	
	public void setX(E element) {
		this.element = element ; 
	}
	
	public E getX() {
		return element ; 
	}
}
*/
public class ClassName<K , V> {
	private K key ; 
	private V value ;
	
	public void setX(K key, V value) {
		this.key   = key ; 
		this.value = value ;
	}
	public K getKey() {
		return this.key ;  
	}
	public V getValue() {
		return this.value ;
	}
}


















