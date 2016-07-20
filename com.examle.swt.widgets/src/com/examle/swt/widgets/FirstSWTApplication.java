package com.examle.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FirstSWTApplication {

    public static void main(String[] args) {
        Display display = new Display();

        Shell shell = new Shell(display);
        
        // the layout manager handle the layout
        // of the widgets in the container
        shell.setLayout(new FillLayout());
        
        //TODO add some widgets to the Shell
     // Shell can be used as container
        Label label = new Label(shell, SWT.BORDER);
        label.setText("This is a label:");
        label.setToolTipText("This is the tooltip of this label");

        Text text = new Text(shell, SWT.NONE);
        text.setText("This is the text in the text widget");
        text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
        text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

        // set widgets size to their preferred size
        text.pack();
        label.pack(); 
        
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}