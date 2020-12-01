# Towards-Hybrid-Stochatic-Formal-Descriptons-for-System-of-Systems
A. Mohsin, N. K. Janjua, S. M. S. Islam and M. A. Babar, "SAM-SoS: A Stochastic Software Architecture Modeling and Verification Approach for Complex System-of-Systems," in IEEE Access, vol. 8, pp. 177580-177603, 2020, doi: 10.1109/ACCESS.2020.3025934.



Formal modeling with Hybrid Stochastic Representations

This repository contains some initial versions of Formally founded Hybrid stochastic formalism for modeling SoS Architectures.

The syntax and semantics are based on process algebras, which are embedded in EBNF using Model-Driven Engineering. Extended syntax and semantics are inspired by existing formal modeling descriptions for Software Architecture Modeling.

A model-driven approach is used based on the Eclipse Modeling Framework (EMF) using tools like Xtext and Xtend based on JAVA.

Note: This is an initial version of the formal modeling for SoS using Hybrid Stochastic Process Algebra. The HSF- generated DSL based models validation, scoping and automated code generation are also part of the ongoing research using EMF existing infrastructures. 

*** Future Research Directions from current state ****

We welcome all researchers who are interested in the following areas for formal modeling, model checking and simulations. 

- HSF Models Transformation to a custom built model checker (Instead of using PRISM, UPPAL, SPIN) we intend to develop its custom model checker with enhanced capabilities for performing stochastic model checking. 
           -    More specifically, we are interested in designing interfaces for describing temporal logic properties including (Functional and non-functional) for SoS architectural models. For this Plasma Lab or PAT model check, infrastructures could be utilized for custom-built model checkers design to perform Stocochastic SoS Architecture models verifications with the freedom to perform various analysis. 
           
-  HSF model transformations to DEVS formalism to perform Dynamis stochastic behavior analysis and Dynamic structural changes Analysis using a range of programming languages, especially Python built-in libraries for performing dynamic stochastic analysis. 

Various Statisitcal Analysis on the top of the stochastic model verifications and stohcastic Simulations can be considered for further validation of the software architecture analysis. For this following set of methods could be considered. 

- Statistical inference 
- Bayesian Statistics
- Data-Driven Analysis on the top of mechanistic modeling or the integration of the both.
