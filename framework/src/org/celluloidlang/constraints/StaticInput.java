package org.celluloidlang.constraints;

public interface StaticInput extends Input {
	
	public void pause();

	public void ffwd(Double multiplier);

	public void rewind(Double multiplier);

	public void seek(double seek);
}
