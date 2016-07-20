package com.examle.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;


public class GeraProjetos {
	
	public Shell shell;

	/*
	 * MÉTODO QUE CAPTURA OS PROJETOS DA WORKSPACE DO ECLIPSE
	 * Armazena numa array e retorna.
	 */
	public IProject[] getProjects(){
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		return projects;
	}
	
	/*
	 * MÉTODO QUE ABRE A JANELA
	 */
	public void open() {
		Display display = Display.getDefault();
		geraConteudo();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	/*
	 * MÉTODO QUE GERA CONTEÚDO DA JANELA
	 */
	protected void geraConteudo() {
		shell = new Shell();
		shell.setSize(391, 197);
		shell.setText("SPL Metrics: Select the Project");
		shell.setLayout(null);

	}

}
