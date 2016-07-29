import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class GeraProjetos {
	private static Text txtProject;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		viewForm.setBounds(142, 83, 0, 0);
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setBounds(111, 24, 295, 23);
		
		txtProject = new Text(shell, SWT.BORDER);
		txtProject.setText("Project:");
		txtProject.setBounds(29, 26, 76, 21);
		
		Button btnApply = new Button(shell, SWT.NONE);
		btnApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.out.println("TESTE! VAI SAFADAO");
			}
		});
		btnApply.setBounds(189, 226, 75, 25);
		btnApply.setText("Apply");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
