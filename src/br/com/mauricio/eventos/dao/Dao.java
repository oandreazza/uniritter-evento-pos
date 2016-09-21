package br.com.mauricio.eventos.dao;

import java.util.List;

import br.com.mauricio.eventos.model.Event;

public interface Dao {

	public void save(Object entity);

	public List<Event> listAll();
}
