# datasample
A project to generate data samples from an ecore model, using an xtext grammar 
This project provides tooling to describe a datasample from an ecore model. 

The datasample defines for all objects described by the Ecore model several paramaters like : number of instance to generate, value generators to use, ...

The XText editor drives the user to describe the sample which is directly generated when the editor is saved. 

This project uses the data generator project (https://github.com/opcoach/datagenerator) which provides basic generators for fields (like dateGenerator, intGenerator, ...). 
