package VittorioVescio.U5W1D2.entities;

public abstract class ExtraAdditionDecorator extends Pizza {
	Pizza pizza;

	@Override
	public abstract String getNome();

	@Override
	public abstract double getPrezzo();

	@Override
	public abstract long getCalorie();

	@Override
	public abstract String getIngredienti();
}