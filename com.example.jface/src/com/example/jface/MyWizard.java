package com.example.jface;

import org.eclipse.jface.wizard.Wizard;

public class MyWizard extends Wizard {

        protected MyPageOne one;
        protected MyPageTwo two;

        public MyWizard() {
                super();
                setNeedsProgressMonitor(true);
        }

        @Override
        public String getWindowTitle() {
                return "Export My Data";
        }

        @Override
        public void addPages() {
                one = new MyPageOne();
                two = new MyPageTwo();
                addPage(one);
                addPage(two);
        }

        @Override
        public boolean performFinish() {
                // Print the result to the console
                System.out.println(one.getText1());
                System.out.println(two.getText1());

                return true;
        }
}