package com.opcoach.datasample.template.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.opcoach.datasample.util.ClassifierComparator;
import com.opcoach.datasample.util.DataSampleUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * this class generate a template from an EPackage
 */
@SuppressWarnings("all")
public class DataSampleTemplateGenerator {
  private List<EClassifier> sortedClasses;
  
  public CharSequence generateSample(final EPackage p) {
    return this.generateSample(p, this.getRootClass(p));
  }
  
  public CharSequence generateSample(final EPackage p, final EClass rootClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Sample ");
    String _firstUpper = StringExtensions.toFirstUpper(p.getName());
    _builder.append(_firstUpper);
    _builder.append("DataSample ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("for \"");
    String _nsURI = p.getNsURI();
    _builder.append(_nsURI);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("generateRootObject ");
    String _name = rootClass.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("fileExtension \"");
    String _name_1 = p.getName();
    _builder.append(_name_1);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("rootGenerator generate  ");
    String _name_2 = rootClass.getName();
    _builder.append(_name_2);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    CharSequence _generateSample = this.generateSample(rootClass);
    _builder.append(_generateSample);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSample(final EClass c) {
    StringConcatenation _builder = new StringConcatenation();
    String _pushCompoLevel = this.pushCompoLevel();
    _builder.append(_pushCompoLevel);
    _builder.newLineIfNotEmpty();
    {
      if ((this.compoLevel <= DataSampleTemplateGenerator.MAX_LEVEL)) {
        _builder.newLine();
        CharSequence _generateAttributes = this.generateAttributes(c);
        _builder.append(_generateAttributes);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        CharSequence _generateCompositions = this.generateCompositions(c);
        _builder.append(_generateCompositions);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        CharSequence _generateAssociations = this.generateAssociations(c);
        _builder.append(_generateAssociations);
        _builder.newLineIfNotEmpty();
      }
    }
    String _popCompoLevel = this.popCompoLevel();
    _builder.append(_popCompoLevel);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateAttributes(final EClass c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Generate attributes ");
    _builder.newLine();
    {
      EList<EAttribute> _eAllAttributes = c.getEAllAttributes();
      for(final EAttribute a : _eAllAttributes) {
        CharSequence _generateFieldGenerator = this.generateFieldGenerator(a);
        _builder.append(_generateFieldGenerator);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateCompositions(final EClass c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Generate compositions ");
    _builder.newLine();
    {
      EList<EReference> _eAllContainments = c.getEAllContainments();
      for(final EReference a : _eAllContainments) {
        CharSequence _generateCompositionGenerator = this.generateCompositionGenerator(a);
        _builder.append(_generateCompositionGenerator);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAssociations(final EClass c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Generate associations ");
    _builder.newLine();
    {
      final Function1<EReference, Boolean> _function = new Function1<EReference, Boolean>() {
        public Boolean apply(final EReference it) {
          boolean _isContainment = it.isContainment();
          return Boolean.valueOf((!_isContainment));
        }
      };
      Iterable<EReference> _filter = IterableExtensions.<EReference>filter(c.getEAllReferences(), _function);
      for(final EReference a : _filter) {
        CharSequence _generateAssociationGenerator = this.generateAssociationGenerator(a);
        _builder.append(_generateAssociationGenerator);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateCompositionGenerator(final EReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("forTheComposition ");
    String _name = reference.getName();
    _builder.append(_name);
    _builder.append(" ");
    CharSequence _entityGenerator = this.entityGenerator(reference.getEReferenceType());
    _builder.append(_entityGenerator);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateAssociationGenerator(final EReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("forTheAssociation ");
    String _name = reference.getName();
    _builder.append(_name);
    _builder.append(" use AssociationGenerator  // To be fixed");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateFieldGenerator(final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("forTheField ");
    String _name = attribute.getName();
    _builder.append(_name);
    _builder.append(" use ");
    String _bestGenerator = this.bestGenerator(attribute);
    _builder.append(_bestGenerator);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String bestGenerator(final EAttribute attribute) {
    String _switchResult = null;
    String _name = attribute.getEType().getName();
    boolean _matched = false;
    if (Objects.equal(_name, "EString")) {
      _matched=true;
      _switchResult = "StringGenerator";
    }
    if (!_matched) {
      if (Objects.equal(_name, "EInt")) {
        _matched=true;
        _switchResult = "IntGenerator";
      }
    }
    if (!_matched) {
      if (Objects.equal(_name, "EBoolean")) {
        _matched=true;
        _switchResult = "BooleanGenerator";
      }
    }
    if (!_matched) {
      _switchResult = "UndefinedGenerator";
    }
    return _switchResult;
  }
  
  public CharSequence entityGenerator(final EClass c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAbstract = c.isAbstract();
      if (_isAbstract) {
        _builder.append("use {");
        _builder.newLine();
        {
          Set<EClass> _subClasses = DataSampleUtil.getSubClasses(c);
          for(final EClass sub : _subClasses) {
            Object _entityGenerator = this.entityGenerator(sub);
            _builder.append(_entityGenerator);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("generate 1 instancesOf ");
        String _name = c.getName();
        _builder.append(_name);
        _builder.append(" { ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _generateSample = this.generateSample(c);
        _builder.append(_generateSample, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public EClass getRootClass(final EPackage p) {
    EClass _xblockexpression = null;
    {
      ArrayList<EClassifier> _arrayList = new ArrayList<EClassifier>();
      this.sortedClasses = _arrayList;
      this.sortedClasses.addAll(p.getEClassifiers());
      ClassifierComparator _classifierComparator = new ClassifierComparator();
      Collections.<EClassifier>sort(this.sortedClasses, _classifierComparator);
      _xblockexpression = IterableExtensions.<EClass>last(Iterables.<EClass>filter(this.sortedClasses, EClass.class));
    }
    return _xblockexpression;
  }
  
  private int compoLevel;
  
  private static int MAX_LEVEL = 2;
  
  public String pushCompoLevel() {
    this.compoLevel++;
    return "";
  }
  
  public String popCompoLevel() {
    this.compoLevel--;
    return "";
  }
  
  public static void main(final String[] args) {
    final DataSampleTemplateGenerator gen = new DataSampleTemplateGenerator();
    final CharSequence result = gen.generateSample(EcorePackage.eINSTANCE, EcorePackage.eINSTANCE.getEPackage());
    InputOutput.<String>println("RESULTAT = ");
    InputOutput.<String>println(result.toString());
  }
}
