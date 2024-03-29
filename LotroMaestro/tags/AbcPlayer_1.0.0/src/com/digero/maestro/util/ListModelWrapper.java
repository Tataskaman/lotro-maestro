package com.digero.maestro.util;

import java.util.AbstractList;

import javax.swing.DefaultListModel;

@SuppressWarnings("unchecked")
public class ListModelWrapper<E> extends AbstractList<E> {
	private DefaultListModel listModel;

	public ListModelWrapper(DefaultListModel listModel) {
		this.listModel = listModel;
	}
	
	public DefaultListModel getListModel() {
		return listModel;
	}

	@Override
	public E get(int index) {
		return (E) listModel.getElementAt(index);
	}

	@Override
	public int size() {
		return listModel.getSize();
	}

	@Override
	public E set(int index, E element) {
		return (E) listModel.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		listModel.add(index, element);
	}

	@Override
	public E remove(int index) {
		return (E) listModel.remove(index);
	}

	@Override
	public boolean remove(Object o) {
		return listModel.removeElement(o);
	}
}
