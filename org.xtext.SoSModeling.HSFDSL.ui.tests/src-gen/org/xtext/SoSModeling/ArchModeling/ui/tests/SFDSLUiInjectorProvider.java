/*
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.SoSModeling.HSFDSL.ui.internal.HSFDSLActivator;

public class SFDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return HSFDSLActivator.getInstance().getInjector("org.xtext.sosModeling.archModeling.SFDSL");
	}

}