/*
 * generated by Xtext 2.19.0
 */
package org.xtext.sosModeling.archModeling


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SFDSLStandaloneSetup extends SFDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new SFDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
