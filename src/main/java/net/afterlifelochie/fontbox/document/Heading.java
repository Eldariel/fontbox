package net.afterlifelochie.fontbox.document;

import java.io.IOException;

import net.afterlifelochie.fontbox.api.ITracer;
import net.afterlifelochie.fontbox.layout.LayoutException;
import net.afterlifelochie.fontbox.layout.PageWriter;
import net.afterlifelochie.fontbox.render.BookGUI;

public class Heading extends Element {

	public String id;
	public String text;

	public Heading(String id, String text) {
		this.id = id;
		this.text = text;
	}

	@Override
	public void layout(ITracer trace, PageWriter writer) throws IOException, LayoutException {
		// TODO: where do we get the metric from?
		// boxText(trace, writer, metric, text);
	}

	@Override
	public boolean canUpdate() {
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(BookGUI gui, int mx, int my, float frame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicked(BookGUI gui, int mx, int my) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void typed(BookGUI gui, char val, int code) {
		// TODO Auto-generated method stub
		
	}

}
