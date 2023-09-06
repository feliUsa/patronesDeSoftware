package model.builder;

public interface Builder {
	
	public void color(String color);
	public void genero(String genero);
	public void tipo(String tipo);
	public Toy getResult();

}
