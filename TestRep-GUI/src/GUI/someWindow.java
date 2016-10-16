package GUI;

import java.awt.GridLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import GUI.BasicWindow;

public class someWindow extends BasicWindow {

	@Override
	public void InitWidgets() {
		org.eclipse.swt.layout.GridLayout grid = new org.eclipse.swt.layout.GridLayout(2, false);
		this.shell.setLayout(grid);
		Composite buttons = new Composite(shell, SWT.NONE);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		buttons.setLayout(rowLayout);
		
		Button button = new Button(buttons, SWT.PUSH);
			
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText();
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		
	}

}
