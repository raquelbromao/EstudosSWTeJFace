package com.examle.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

public class GeraProjetos {

	public static Shell shell;

	/*
	 * MÉTODO QUE CAPTURA OS PROJETOS DA WORKSPACE DO ECLIPSE 
	 * Armazena numa array e retorna.
	 */
	public static IProject[] getProjects() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		return projects;
	}

	/*
	 * MÉTODO QUE GERA CONTEÚDO DA JANELA
	 */
	protected static void geraConteudo() {
		shell = new Shell();
		// shell.setSize(391, 197);
		shell.setText("SPL Metrics: Select the Project");
		shell.setLayout(new FillLayout(SWT.VERTICAL));

		Label lblSelecionaProjeto = new Label(shell, SWT.BORDER);
		lblSelecionaProjeto.setText("Select the project:");

		Composite composite = new Composite(shell, SWT.NONE);

		Label lblProjeto = new Label(composite, SWT.NONE);
		lblProjeto.setText("Project: ");

		//Combo combo = new Combo(composite, SWT.NONE);

		//PEGA TDS OS PROJETOS DA WORKSPACE
		//IProject[] projects = getProjects();
		
		//ADICIONA AO COMBO
		/*for (int i = 0; i < projects.length; i++) {
			combo.add(projects[i].getName());
		}		*/
		
	}
	
	/*
	 * MÉTODO QUE ABRE A JANELA
	 */
	public static void main(String[] args) {
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

}
