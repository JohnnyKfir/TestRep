package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class BasicWindow {
	protected Display display;
	protected Shell shell;
	
	public abstract void InitWidgets();
	
	public void start() {
		InitWidgets();
		shell.open();
		
		display = new Display();
		shell = new Shell(display);
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
